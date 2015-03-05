package org.xtext.example.pascal.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.abstraction_declaration;
import org.xtext.example.pascal.pascal.abstraction_heading;
import org.xtext.example.pascal.pascal.any_number;
import org.xtext.example.pascal.pascal.array_type;
import org.xtext.example.pascal.pascal.assignment_statement;
import org.xtext.example.pascal.pascal.block;
import org.xtext.example.pascal.pascal.bound_specification;
import org.xtext.example.pascal.pascal.case_label_list;
import org.xtext.example.pascal.pascal.case_limb;
import org.xtext.example.pascal.pascal.case_statement;
import org.xtext.example.pascal.pascal.compound_statement;
import org.xtext.example.pascal.pascal.conditional_statement;
import org.xtext.example.pascal.pascal.conformant_array_schema;
import org.xtext.example.pascal.pascal.constant;
import org.xtext.example.pascal.pascal.constant_definition;
import org.xtext.example.pascal.pascal.constant_definition_part;
import org.xtext.example.pascal.pascal.dynamic_array_type;
import org.xtext.example.pascal.pascal.enumerated_type;
import org.xtext.example.pascal.pascal.expression;
import org.xtext.example.pascal.pascal.expression_list;
import org.xtext.example.pascal.pascal.factor;
import org.xtext.example.pascal.pascal.field_list;
import org.xtext.example.pascal.pascal.file_type;
import org.xtext.example.pascal.pascal.fixed_part;
import org.xtext.example.pascal.pascal.for_statement;
import org.xtext.example.pascal.pascal.formal_parameter_list;
import org.xtext.example.pascal.pascal.formal_parameter_section;
import org.xtext.example.pascal.pascal.function_designator;
import org.xtext.example.pascal.pascal.goto_statement;
import org.xtext.example.pascal.pascal.identifier_list;
import org.xtext.example.pascal.pascal.if_statement;
import org.xtext.example.pascal.pascal.index_type;
import org.xtext.example.pascal.pascal.label;
import org.xtext.example.pascal.pascal.label_declaration_part;
import org.xtext.example.pascal.pascal.number;
import org.xtext.example.pascal.pascal.packed_conformant_array_schema;
import org.xtext.example.pascal.pascal.parameter_type;
import org.xtext.example.pascal.pascal.pascal;
import org.xtext.example.pascal.pascal.pointer_type;
import org.xtext.example.pascal.pascal.procedure_and_function_declaration_part;
import org.xtext.example.pascal.pascal.program;
import org.xtext.example.pascal.pascal.program_heading_block;
import org.xtext.example.pascal.pascal.record_section;
import org.xtext.example.pascal.pascal.record_type;
import org.xtext.example.pascal.pascal.repeat_statement;
import org.xtext.example.pascal.pascal.repetitive_statement;
import org.xtext.example.pascal.pascal.set;
import org.xtext.example.pascal.pascal.set_type;
import org.xtext.example.pascal.pascal.simple_expression;
import org.xtext.example.pascal.pascal.simple_statement;
import org.xtext.example.pascal.pascal.simple_type;
import org.xtext.example.pascal.pascal.statement;
import org.xtext.example.pascal.pascal.statement_part;
import org.xtext.example.pascal.pascal.statement_sequence;
import org.xtext.example.pascal.pascal.structured_statement;
import org.xtext.example.pascal.pascal.structured_type;
import org.xtext.example.pascal.pascal.subrange_type;
import org.xtext.example.pascal.pascal.tag_field;
import org.xtext.example.pascal.pascal.term;
import org.xtext.example.pascal.pascal.type;
import org.xtext.example.pascal.pascal.type_definition;
import org.xtext.example.pascal.pascal.type_definition_part;
import org.xtext.example.pascal.pascal.unpacked_conformant_array_schema;
import org.xtext.example.pascal.pascal.unpacked_structured_type;
import org.xtext.example.pascal.pascal.value_parameter_section;
import org.xtext.example.pascal.pascal.var_;
import org.xtext.example.pascal.pascal.variable;
import org.xtext.example.pascal.pascal.variable_declaration_part;
import org.xtext.example.pascal.pascal.variable_identifier_list;
import org.xtext.example.pascal.pascal.variable_parameter_section;
import org.xtext.example.pascal.pascal.variable_section;
import org.xtext.example.pascal.pascal.variant;
import org.xtext.example.pascal.pascal.variant_part;
import org.xtext.example.pascal.pascal.while_statement;
import org.xtext.example.pascal.pascal.with_statement;
import org.xtext.example.pascal.services.PascalGrammarAccess;

@SuppressWarnings("all")
public class PascalSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PascalGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PascalPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PascalPackage.ABSTRACTION_DECLARATION:
				if(context == grammarAccess.getAbstraction_declarationRule() ||
				   context == grammarAccess.getFunction_declarationRule()) {
					sequence_function_declaration(context, (abstraction_declaration) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.ABSTRACTION_HEADING:
				if(context == grammarAccess.getAbstraction_headingRule()) {
					sequence_abstraction_heading_function_heading_procedure_heading(context, (abstraction_heading) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFunction_headingRule()) {
					sequence_function_heading(context, (abstraction_heading) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAbstraction_declarationRule() ||
				   context == grammarAccess.getProcedure_declarationRule()) {
					sequence_procedure_declaration(context, (abstraction_heading) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getProcedure_headingRule()) {
					sequence_procedure_heading(context, (abstraction_heading) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.ANY_NUMBER:
				if(context == grammarAccess.getAny_numberRule()) {
					sequence_any_number_signed_number_unsigned_number(context, (any_number) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSigned_numberRule()) {
					sequence_signed_number(context, (any_number) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getUnsigned_numberRule()) {
					sequence_unsigned_number(context, (any_number) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.ARRAY_TYPE:
				if(context == grammarAccess.getArray_typeRule()) {
					sequence_array_type(context, (array_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.ASSIGNMENT_STATEMENT:
				if(context == grammarAccess.getAssignment_statementRule()) {
					sequence_assignment_statement(context, (assignment_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_block(context, (block) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.BOUND_SPECIFICATION:
				if(context == grammarAccess.getBound_specificationRule()) {
					sequence_bound_specification(context, (bound_specification) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CASE_LABEL_LIST:
				if(context == grammarAccess.getCase_label_listRule()) {
					sequence_case_label_list(context, (case_label_list) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CASE_LIMB:
				if(context == grammarAccess.getCase_limbRule()) {
					sequence_case_limb(context, (case_limb) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CASE_STATEMENT:
				if(context == grammarAccess.getCase_statementRule()) {
					sequence_case_statement(context, (case_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.COMPOUND_STATEMENT:
				if(context == grammarAccess.getCompound_statementRule()) {
					sequence_compound_statement(context, (compound_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CONDITIONAL_STATEMENT:
				if(context == grammarAccess.getConditional_statementRule()) {
					sequence_conditional_statement(context, (conditional_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CONFORMANT_ARRAY_SCHEMA:
				if(context == grammarAccess.getConformant_array_schemaRule()) {
					sequence_conformant_array_schema(context, (conformant_array_schema) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule()) {
					sequence_constant(context, (constant) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CONSTANT_DEFINITION:
				if(context == grammarAccess.getConstant_definitionRule()) {
					sequence_constant_definition(context, (constant_definition) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.CONSTANT_DEFINITION_PART:
				if(context == grammarAccess.getConstant_definition_partRule()) {
					sequence_constant_definition_part(context, (constant_definition_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.DYNAMIC_ARRAY_TYPE:
				if(context == grammarAccess.getDynamic_array_typeRule()) {
					sequence_dynamic_array_type(context, (dynamic_array_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.ENUMERATED_TYPE:
				if(context == grammarAccess.getEnumerated_typeRule()) {
					sequence_enumerated_type(context, (enumerated_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_expression(context, (expression) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.EXPRESSION_LIST:
				if(context == grammarAccess.getExpression_listRule()) {
					sequence_expression_list(context, (expression_list) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FACTOR:
				if(context == grammarAccess.getFactorRule()) {
					sequence_factor(context, (factor) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FIELD_LIST:
				if(context == grammarAccess.getField_listRule()) {
					sequence_field_list(context, (field_list) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FILE_TYPE:
				if(context == grammarAccess.getFile_typeRule()) {
					sequence_file_type(context, (file_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FIXED_PART:
				if(context == grammarAccess.getFixed_partRule()) {
					sequence_fixed_part(context, (fixed_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FOR_STATEMENT:
				if(context == grammarAccess.getFor_statementRule()) {
					sequence_for_statement(context, (for_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FORMAL_PARAMETER_LIST:
				if(context == grammarAccess.getFormal_parameter_listRule()) {
					sequence_formal_parameter_list(context, (formal_parameter_list) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FORMAL_PARAMETER_SECTION:
				if(context == grammarAccess.getFormal_parameter_sectionRule()) {
					sequence_formal_parameter_section(context, (formal_parameter_section) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.FUNCTION_DESIGNATOR:
				if(context == grammarAccess.getFunction_designatorRule()) {
					sequence_function_designator(context, (function_designator) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.GOTO_STATEMENT:
				if(context == grammarAccess.getGoto_statementRule()) {
					sequence_goto_statement(context, (goto_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.IDENTIFIER_LIST:
				if(context == grammarAccess.getIdentifier_listRule()) {
					sequence_identifier_list(context, (identifier_list) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.IF_STATEMENT:
				if(context == grammarAccess.getIf_statementRule()) {
					sequence_if_statement(context, (if_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.INDEX_TYPE:
				if(context == grammarAccess.getIndex_typeRule()) {
					sequence_index_type(context, (index_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.LABEL:
				if(context == grammarAccess.getLabelRule()) {
					sequence_label(context, (label) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.LABEL_DECLARATION_PART:
				if(context == grammarAccess.getLabel_declaration_partRule()) {
					sequence_label_declaration_part(context, (label_declaration_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.NUMBER:
				if(context == grammarAccess.getNumberRule()) {
					sequence_number(context, (number) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PACKED_CONFORMANT_ARRAY_SCHEMA:
				if(context == grammarAccess.getPacked_conformant_array_schemaRule()) {
					sequence_packed_conformant_array_schema(context, (packed_conformant_array_schema) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PARAMETER_TYPE:
				if(context == grammarAccess.getParameter_typeRule()) {
					sequence_parameter_type(context, (parameter_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PASCAL:
				if(context == grammarAccess.getPascalRule()) {
					sequence_pascal(context, (pascal) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.POINTER_TYPE:
				if(context == grammarAccess.getPointer_typeRule()) {
					sequence_pointer_type(context, (pointer_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART:
				if(context == grammarAccess.getProcedure_and_function_declaration_partRule()) {
					sequence_procedure_and_function_declaration_part(context, (procedure_and_function_declaration_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_program(context, (program) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.PROGRAM_HEADING_BLOCK:
				if(context == grammarAccess.getProgram_heading_blockRule()) {
					sequence_program_heading_block(context, (program_heading_block) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.RECORD_SECTION:
				if(context == grammarAccess.getRecord_sectionRule()) {
					sequence_record_section(context, (record_section) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.RECORD_TYPE:
				if(context == grammarAccess.getRecord_typeRule()) {
					sequence_record_type(context, (record_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.REPEAT_STATEMENT:
				if(context == grammarAccess.getRepeat_statementRule()) {
					sequence_repeat_statement(context, (repeat_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.REPETITIVE_STATEMENT:
				if(context == grammarAccess.getRepetitive_statementRule()) {
					sequence_repetitive_statement(context, (repetitive_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.SET:
				if(context == grammarAccess.getSetRule()) {
					sequence_set(context, (set) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.SET_TYPE:
				if(context == grammarAccess.getSet_typeRule()) {
					sequence_set_type(context, (set_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.SIMPLE_EXPRESSION:
				if(context == grammarAccess.getSimple_expressionRule()) {
					sequence_simple_expression(context, (simple_expression) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.SIMPLE_STATEMENT:
				if(context == grammarAccess.getSimple_statementRule()) {
					sequence_simple_statement(context, (simple_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.SIMPLE_TYPE:
				if(context == grammarAccess.getSimple_typeRule()) {
					sequence_simple_type(context, (simple_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_statement(context, (statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.STATEMENT_PART:
				if(context == grammarAccess.getStatement_partRule()) {
					sequence_statement_part(context, (statement_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.STATEMENT_SEQUENCE:
				if(context == grammarAccess.getStatement_sequenceRule()) {
					sequence_statement_sequence(context, (statement_sequence) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.STRUCTURED_STATEMENT:
				if(context == grammarAccess.getStructured_statementRule()) {
					sequence_structured_statement(context, (structured_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.STRUCTURED_TYPE:
				if(context == grammarAccess.getStructured_typeRule()) {
					sequence_structured_type(context, (structured_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.SUBRANGE_TYPE:
				if(context == grammarAccess.getSubrange_typeRule()) {
					sequence_subrange_type(context, (subrange_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.TAG_FIELD:
				if(context == grammarAccess.getTag_fieldRule()) {
					sequence_tag_field(context, (tag_field) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_term(context, (term) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_type(context, (type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.TYPE_DEFINITION:
				if(context == grammarAccess.getType_definitionRule()) {
					sequence_type_definition(context, (type_definition) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.TYPE_DEFINITION_PART:
				if(context == grammarAccess.getType_definition_partRule()) {
					sequence_type_definition_part(context, (type_definition_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA:
				if(context == grammarAccess.getUnpacked_conformant_array_schemaRule()) {
					sequence_unpacked_conformant_array_schema(context, (unpacked_conformant_array_schema) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.UNPACKED_STRUCTURED_TYPE:
				if(context == grammarAccess.getUnpacked_structured_typeRule()) {
					sequence_unpacked_structured_type(context, (unpacked_structured_type) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VALUE_PARAMETER_SECTION:
				if(context == grammarAccess.getValue_parameter_sectionRule()) {
					sequence_value_parameter_section(context, (value_parameter_section) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VAR_:
				if(context == grammarAccess.getVar_Rule()) {
					sequence_var_(context, (var_) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_variable(context, (variable) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIABLE_DECLARATION_PART:
				if(context == grammarAccess.getVariable_declaration_partRule()) {
					sequence_variable_declaration_part(context, (variable_declaration_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIABLE_IDENTIFIER_LIST:
				if(context == grammarAccess.getVariable_identifier_listRule()) {
					sequence_variable_identifier_list(context, (variable_identifier_list) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIABLE_PARAMETER_SECTION:
				if(context == grammarAccess.getVariable_parameter_sectionRule()) {
					sequence_variable_parameter_section(context, (variable_parameter_section) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIABLE_SECTION:
				if(context == grammarAccess.getVariable_sectionRule()) {
					sequence_variable_section(context, (variable_section) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIANT:
				if(context == grammarAccess.getVariantRule()) {
					sequence_variant(context, (variant) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.VARIANT_PART:
				if(context == grammarAccess.getVariant_partRule()) {
					sequence_variant_part(context, (variant_part) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.WHILE_STATEMENT:
				if(context == grammarAccess.getWhile_statementRule()) {
					sequence_while_statement(context, (while_statement) semanticObject); 
					return; 
				}
				else break;
			case PascalPackage.WITH_STATEMENT:
				if(context == grammarAccess.getWith_statementRule()) {
					sequence_with_statement(context, (with_statement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((name=ID parameters=formal_parameter_list?) | (name=ID parameters=formal_parameter_list? returnType=ID))
	 */
	protected void sequence_abstraction_heading_function_heading_procedure_heading(EObject context, abstraction_heading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (integer=INTEGER_NUMBER | real=REAL_NUMBER | integer=SIGNED_INTEGER_NUMBER | real=SIGNED_REAL_NUMBER)
	 */
	protected void sequence_any_number_signed_number_unsigned_number(EObject context, any_number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (indexes+=index_type indexes+=index_type* type=type)
	 */
	protected void sequence_array_type(EObject context, array_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=variable expression=expression)
	 */
	protected void sequence_assignment_statement(EObject context, assignment_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.ASSIGNMENT_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.ASSIGNMENT_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         label=label_declaration_part? 
	 *         constant=constant_definition_part? 
	 *         type=type_definition_part? 
	 *         variable=variable_declaration_part? 
	 *         abstraction=procedure_and_function_declaration_part? 
	 *         statement=statement_part
	 *     )
	 */
	protected void sequence_block(EObject context, block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (initial=ID final=ID name=ID)
	 */
	protected void sequence_bound_specification(EObject context, bound_specification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__INITIAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__INITIAL));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__FINAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__FINAL));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.BOUND_SPECIFICATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBound_specificationAccess().getInitialIDTerminalRuleCall_0_0(), semanticObject.getInitial());
		feeder.accept(grammarAccess.getBound_specificationAccess().getFinalIDTerminalRuleCall_2_0(), semanticObject.getFinal());
		feeder.accept(grammarAccess.getBound_specificationAccess().getNameIDTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (constants+=constant constants+=constant*)
	 */
	protected void sequence_case_label_list(EObject context, case_label_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cases=case_label_list statement=statement)
	 */
	protected void sequence_case_limb(EObject context, case_limb semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.CASE_LIMB__CASES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.CASE_LIMB__CASES));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.CASE_LIMB__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.CASE_LIMB__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCase_limbAccess().getCasesCase_label_listParserRuleCall_0_0(), semanticObject.getCases());
		feeder.accept(grammarAccess.getCase_limbAccess().getStatementStatementParserRuleCall_2_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=expression cases+=case_limb cases+=case_limb*)
	 */
	protected void sequence_case_statement(EObject context, case_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sequence=statement_sequence
	 */
	protected void sequence_compound_statement(EObject context, compound_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.COMPOUND_STATEMENT__SEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.COMPOUND_STATEMENT__SEQUENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0(), semanticObject.getSequence());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ifStmt=if_statement | caseStmt=case_statement)
	 */
	protected void sequence_conditional_statement(EObject context, conditional_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (packed=packed_conformant_array_schema | unpacked=unpacked_conformant_array_schema)
	 */
	protected void sequence_conformant_array_schema(EObject context, conformant_array_schema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((opterator=ADDITION_OPERATOR? (name=ID | number=number)) | string=STRING | boolLiteral='true' | boolLiteral='false' | nil='nil')
	 */
	protected void sequence_constant(EObject context, constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID const=constant)
	 */
	protected void sequence_constant_definition(EObject context, constant_definition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.CONSTANT_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.CONSTANT_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.CONSTANT_DEFINITION__CONST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.CONSTANT_DEFINITION__CONST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0(), semanticObject.getConst());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     consts+=constant_definition+
	 */
	protected void sequence_constant_definition_part(EObject context, constant_definition_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=type
	 */
	protected void sequence_dynamic_array_type(EObject context, dynamic_array_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.DYNAMIC_ARRAY_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.DYNAMIC_ARRAY_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDynamic_array_typeAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     identifiers=identifier_list
	 */
	protected void sequence_enumerated_type(EObject context, enumerated_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.ENUMERATED_TYPE__IDENTIFIERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.ENUMERATED_TYPE__IDENTIFIERS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0(), semanticObject.getIdentifiers());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=simple_expression ((operator=RELATIONAL_OPERATOR | operator='in' | operator='=') expressions+=simple_expression)?)
	 */
	protected void sequence_expression(EObject context, expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=expression expressions+=expression*)
	 */
	protected void sequence_expression_list(EObject context, expression_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         variable=variable | 
	 *         number=number | 
	 *         string=STRING | 
	 *         set=set | 
	 *         nil?='nil' | 
	 *         boolean='true' | 
	 *         boolean='false' | 
	 *         function=function_designator | 
	 *         expression=expression | 
	 *         not=factor
	 *     )
	 */
	protected void sequence_factor(EObject context, factor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((fixed=fixed_part variants+=variant_part?) | variants+=variant_part)
	 */
	protected void sequence_field_list(EObject context, field_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=type
	 */
	protected void sequence_file_type(EObject context, file_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FILE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FILE_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFile_typeAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sections+=record_section sections+=record_section*)
	 */
	protected void sequence_fixed_part(EObject context, fixed_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (assignment=assignment_statement expression=expression statement=statement)
	 */
	protected void sequence_for_statement(EObject context, for_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FOR_STATEMENT__ASSIGNMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FOR_STATEMENT__ASSIGNMENT));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FOR_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FOR_STATEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.FOR_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.FOR_STATEMENT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFor_statementAccess().getAssignmentAssignment_statementParserRuleCall_1_0(), semanticObject.getAssignment());
		feeder.accept(grammarAccess.getFor_statementAccess().getExpressionExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_5_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameters+=formal_parameter_section parameters+=formal_parameter_section*)
	 */
	protected void sequence_formal_parameter_list(EObject context, formal_parameter_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=value_parameter_section | variable=variable_parameter_section | procedure=procedure_heading | function=function_heading)
	 */
	protected void sequence_formal_parameter_section(EObject context, formal_parameter_section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (heading=function_heading (block=block | forward?='forward'))
	 */
	protected void sequence_function_declaration(EObject context, abstraction_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expressions=expression_list?)
	 */
	protected void sequence_function_designator(EObject context, function_designator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameters=formal_parameter_list? returnType=ID)
	 */
	protected void sequence_function_heading(EObject context, abstraction_heading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     label=label
	 */
	protected void sequence_goto_statement(EObject context, goto_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.GOTO_STATEMENT__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.GOTO_STATEMENT__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGoto_statementAccess().getLabelLabelParserRuleCall_1_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (names+=ID names+=ID*)
	 */
	protected void sequence_identifier_list(EObject context, identifier_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=expression ifStatement=statement elseStatement=statement?)
	 */
	protected void sequence_if_statement(EObject context, if_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=simple_type
	 */
	protected void sequence_index_type(EObject context, index_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.INDEX_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.INDEX_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIndex_typeAccess().getTypeSimple_typeParserRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (labels+=label labels+=label*)
	 */
	protected void sequence_label_declaration_part(EObject context, label_declaration_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (number=SIGNED_INTEGER_NUMBER | number=INTEGER_NUMBER)
	 */
	protected void sequence_label(EObject context, label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     number=any_number
	 */
	protected void sequence_number(EObject context, number semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.NUMBER__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.NUMBER__NUMBER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (bound=bound_specification name=ID)
	 */
	protected void sequence_packed_conformant_array_schema(EObject context, packed_conformant_array_schema semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PACKED_CONFORMANT_ARRAY_SCHEMA__BOUND));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PACKED_CONFORMANT_ARRAY_SCHEMA__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PACKED_CONFORMANT_ARRAY_SCHEMA__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundBound_specificationParserRuleCall_3_0(), semanticObject.getBound());
		feeder.accept(grammarAccess.getPacked_conformant_array_schemaAccess().getNameIDTerminalRuleCall_6_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (array=conformant_array_schema | name=ID)
	 */
	protected void sequence_parameter_type(EObject context, parameter_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     program+=program
	 */
	protected void sequence_pascal(EObject context, pascal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=type
	 */
	protected void sequence_pointer_type(EObject context, pointer_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.POINTER_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.POINTER_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (procedures+=procedure_declaration | functions+=function_declaration)+
	 */
	protected void sequence_procedure_and_function_declaration_part(EObject context, procedure_and_function_declaration_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (heading=procedure_heading (block=block | forward?='forward'))
	 */
	protected void sequence_procedure_declaration(EObject context, abstraction_heading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameters=formal_parameter_list?)
	 */
	protected void sequence_procedure_heading(EObject context, abstraction_heading semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID identifiers=identifier_list?)
	 */
	protected void sequence_program_heading_block(EObject context, program_heading_block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (heading=program_heading_block block=block)
	 */
	protected void sequence_program(EObject context, program semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PROGRAM__HEADING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PROGRAM__HEADING));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.PROGRAM__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.PROGRAM__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0(), semanticObject.getHeading());
		feeder.accept(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (identifiers=identifier_list type=type)
	 */
	protected void sequence_record_section(EObject context, record_section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.RECORD_SECTION__IDENTIFIERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.RECORD_SECTION__IDENTIFIERS));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.RECORD_SECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.RECORD_SECTION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecord_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0(), semanticObject.getIdentifiers());
		feeder.accept(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (recordKeyword='record' fields=field_list? endKeyword='end')
	 */
	protected void sequence_record_type(EObject context, record_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sequence=statement_sequence expression=expression)
	 */
	protected void sequence_repeat_statement(EObject context, repeat_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.REPEAT_STATEMENT__SEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.REPEAT_STATEMENT__SEQUENCE));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.REPEAT_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.REPEAT_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRepeat_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0(), semanticObject.getSequence());
		feeder.accept(grammarAccess.getRepeat_statementAccess().getExpressionExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (whileStmt=while_statement | repeatStmt=repeat_statement | forStmt=for_statement)
	 */
	protected void sequence_repetitive_statement(EObject context, repetitive_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (brackets+='[' expressions=expression_list? brackets+=']')
	 */
	protected void sequence_set(EObject context, set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=type
	 */
	protected void sequence_set_type(EObject context, set_type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.SET_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.SET_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (integer=SIGNED_INTEGER_NUMBER | real=SIGNED_REAL_NUMBER)
	 */
	protected void sequence_signed_number(EObject context, any_number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operators+=ADDITION_OPERATOR? terms+=term (((operators+=ADDITION_OPERATOR+ | operators+='or') terms+=term) | numbers+=signed_number)*)
	 */
	protected void sequence_simple_expression(EObject context, simple_expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (assignment=assignment_statement | function=function_designator | goto=goto_statement | function_noargs=ID)?
	 */
	protected void sequence_simple_statement(EObject context, simple_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subrange=subrange_type | enumerated=enumerated_type | name=ID)
	 */
	protected void sequence_simple_type(EObject context, simple_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sequence=statement_sequence
	 */
	protected void sequence_statement_part(EObject context, statement_part semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.STATEMENT_PART__SEQUENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.STATEMENT_PART__SEQUENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0(), semanticObject.getSequence());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=statement statements+=statement*)
	 */
	protected void sequence_statement_sequence(EObject context, statement_sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=label? (simple=simple_statement | structured=structured_statement))
	 */
	protected void sequence_statement(EObject context, statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (compound=compound_statement | repetitive=repetitive_statement | conditional=conditional_statement | withStmt=with_statement)
	 */
	protected void sequence_structured_statement(EObject context, structured_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (packed?='packed'? type=unpacked_structured_type)
	 */
	protected void sequence_structured_type(EObject context, structured_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((initialConst=constant finalConst=constant) | (subrange=NUMERIC_SUBRANGE const=constant))
	 */
	protected void sequence_subrange_type(EObject context, subrange_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_tag_field(EObject context, tag_field semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.TAG_FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.TAG_FIELD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTag_fieldAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (factors+=factor ((operators+=MULTIPLICATION_OPERATOR | operators+='div' | operators+='mod' | operators+='and') factors+=factor)*)
	 */
	protected void sequence_term(EObject context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     types+=type_definition+
	 */
	protected void sequence_type_definition_part(EObject context, type_definition_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=type)
	 */
	protected void sequence_type_definition(EObject context, type_definition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.TYPE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.TYPE_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.TYPE_DEFINITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.TYPE_DEFINITION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (simple=simple_type | structured=structured_type | pointer=pointer_type)
	 */
	protected void sequence_type(EObject context, type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bounds+=bound_specification bounds+=bound_specification* type=parameter_type)
	 */
	protected void sequence_unpacked_conformant_array_schema(EObject context, unpacked_conformant_array_schema semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (array=array_type | dynamic=dynamic_array_type | record=record_type | set=set_type | file=file_type)
	 */
	protected void sequence_unpacked_structured_type(EObject context, unpacked_structured_type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (integer=INTEGER_NUMBER | real=REAL_NUMBER)
	 */
	protected void sequence_unsigned_number(EObject context, any_number semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifiers=identifier_list type=parameter_type)
	 */
	protected void sequence_value_parameter_section(EObject context, value_parameter_section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__IDENTIFIERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__IDENTIFIERS));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VALUE_PARAMETER_SECTION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0(), semanticObject.getIdentifiers());
		feeder.accept(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((expressions=expression_list array=var_) | (accessor?='.' name=ID variable=var_) | pointer=var_)?
	 */
	protected void sequence_var_(EObject context, var_ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sections+=variable_section sections+=variable_section*)
	 */
	protected void sequence_variable_declaration_part(EObject context, variable_declaration_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (names+=ID names+=ID*)
	 */
	protected void sequence_variable_identifier_list(EObject context, variable_identifier_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (identifiers=identifier_list type=parameter_type)
	 */
	protected void sequence_variable_parameter_section(EObject context, variable_parameter_section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__IDENTIFIERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__IDENTIFIERS));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_1_0(), semanticObject.getIdentifiers());
		feeder.accept(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (identifiers=variable_identifier_list type=type)
	 */
	protected void sequence_variable_section(EObject context, variable_section semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE_SECTION__IDENTIFIERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE_SECTION__IDENTIFIERS));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE_SECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE_SECTION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0(), semanticObject.getIdentifiers());
		feeder.accept(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID variable=var_)
	 */
	protected void sequence_variable(EObject context, variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.VARIABLE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.VARIABLE__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tag=tag_field? name=ID variants+=variant variants+=variant*)
	 */
	protected void sequence_variant_part(EObject context, variant_part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (labels=case_label_list fields=field_list?)
	 */
	protected void sequence_variant(EObject context, variant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=expression statement=statement)
	 */
	protected void sequence_while_statement(EObject context, while_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.WHILE_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.WHILE_STATEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, PascalPackage.Literals.WHILE_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalPackage.Literals.WHILE_STATEMENT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getWhile_statementAccess().getStatementStatementParserRuleCall_3_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variables+=variable variables+=variable* statement=statement)
	 */
	protected void sequence_with_statement(EObject context, with_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
