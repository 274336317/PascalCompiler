package org.xtext.example.pascal.validation;


public class Variable extends Element {

	private String varType;
	
	public Variable(String name, String varType, boolean inherited, ElementType type) {
		super(name, type, inherited);
		this.varType = varType;
	}
	
	public Variable(String name) {
		this(name, null, false, ElementType.VARIABLE);
	}
	
	public String getVarType() {
		return this.varType;
	}
	 
	@Override
	public Element clone() {
		return new Variable(this.name, this.varType, this.inherited, this.type);
	}

	@Override
	public String toString() {
		return "[" + this.name + ", " + this.inherited + ", " + this.type + ", " + this.varType + "]";
	}
	 
}
