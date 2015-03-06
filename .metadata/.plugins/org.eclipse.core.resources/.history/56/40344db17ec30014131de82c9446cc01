package org.xtext.example.pascal.validation;

public class Type extends Element {

	private String realType;
	
	public Type(String name, boolean inherited, String realType) {
		super(name, ElementType.TYPE, inherited);
		this.realType = realType;
	}
	
	public Type(String name) {
		this(name, false, null);
	}
	
	public String getRealType() {
		return this.realType;
	}
	
	@Override
	public Element clone() {
		Type t = new Type(this.name, this.inherited, this.realType);
		return t;
	}

}
