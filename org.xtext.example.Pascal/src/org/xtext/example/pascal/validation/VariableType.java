package org.xtext.example.pascal.validation;

public enum VariableType {

	VARIABLE, CONSTANT, PARAMETER, FUNCTION_RETURN;
	
	@Override
	public String toString() {
		switch(this) {
		case VARIABLE:
			return "Variable";
		case CONSTANT:
			return "Constant";
		default:
			return "Parameter";
		}
	}
	
}
