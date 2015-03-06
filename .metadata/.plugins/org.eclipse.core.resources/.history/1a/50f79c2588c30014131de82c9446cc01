package org.xtext.example.pascal.validation;

import java.util.Set;

public class Function extends Procedure {

	private String returnType;
	
	public Function(String name, boolean inherited, Set<Variable> parameters, boolean forward, String returnType) {
		super(name, ElementType.FUNCTION, inherited, parameters, forward);
		this.returnType = returnType;
	}
	
	public Function(String name, Set<Variable> parameters) {
		this(name, false, parameters, false, null);
	}
	
	public String getReturnType() {
		return this.returnType;
	}
	
	@Override
	public Element clone() {
		return new Function(this.name, this.inherited, this.parameters, this.forward, this.returnType);
	}

	@Override
	public String toString() {
		return "[" + this.name + ", " + this.inherited + ", " + this.type + ", " + this.returnType + "]";
	}
	 
}
