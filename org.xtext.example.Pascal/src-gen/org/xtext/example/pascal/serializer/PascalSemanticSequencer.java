package org.xtext.example.pascal.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.pascal;
import org.xtext.example.pascal.services.PascalGrammarAccess;

@SuppressWarnings("all")
public class PascalSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PascalGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PascalPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PascalPackage.PASCAL:
				if(context == grammarAccess.getPascalRule()) {
					sequence_pascal(context, (pascal) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     program+=program
	 */
	protected void sequence_pascal(EObject context, pascal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
