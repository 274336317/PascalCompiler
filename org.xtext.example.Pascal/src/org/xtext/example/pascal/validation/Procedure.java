package org.xtext.example.pascal.validation;

import java.util.Set;

public class Procedure extends Element {

	protected Set<Variable> parameters;
	protected boolean forward;
	
	public Procedure(String name, ElementType type, boolean inherited, Set<Variable> parameters, boolean forward) {
		super(name, type, inherited);
		this.parameters = parameters;
		this.forward = forward;
	}
	
	public Procedure(String name, Set<Variable> parameters, boolean inherited, boolean forward) {
		this(name, ElementType.PROCEDURE, inherited, parameters, forward);
	}

	public Procedure(String name) {
		this(name, ElementType.PROCEDURE, false, null, false);
	}
	
	public Set<Variable> getParameters() {
		return this.parameters;
	}
	
	public boolean isForward() {
		return this.forward;
	}
	
	@Override
	public Element clone() {
		return new Procedure(this.name, this.type, this.inherited, this.parameters, this.forward);
	}
	
}
