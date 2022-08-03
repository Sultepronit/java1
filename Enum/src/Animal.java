
/*public enum Animal {
	CAT, DOG, MOUSE
}*/

public enum Animal {
	
	CAT("Tufo"), DOG("Jack"), MOUSE("Jerry");
	
	private String name;
	
	Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	// without the 
	public String toString() {
		return name;
	}
	
}
