package org.xtext.example.pascal.validation;


public abstract class Element implements Comparable<Element> {

	protected String name;
	protected ElementType type;
	protected boolean inherited;
	
	public Element(String name, ElementType type, boolean inherited) {
		this.name = name;
		this.type = type;
		this.inherited = inherited;
	}
	
	public String getName() {
		return this.name;
	}
	
	public ElementType getType() {
		return this.type;
	}

	public boolean isInherited() {
		return this.inherited;
	}

	public abstract Element clone();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.toLowerCase().equals(other.name.toLowerCase()))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + this.name + ", " + this.inherited + ", " + this.type + "]";
	}
	 
	@Override
	public int compareTo(Element other) {
		return this.name.compareTo(other.name);
	}
	 
}
