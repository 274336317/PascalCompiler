package org.xtext.example.pascal.validation;

public class Type extends Element {

	public Type(String name, boolean inherited) {
		super(name, ElementType.TYPE, inherited);
	}
	
	@Override
	public Element clone() {
		Type t = new Type(this.name, this.inherited);
		return t;
	}

}
