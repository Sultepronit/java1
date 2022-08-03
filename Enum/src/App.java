
public class App {
	
	/*public static final int DOG = 0;
	public static final int CAT = 1;
	public static final int MOUSE = 2;*/

	public static void main(String[] args) {
		
		/*int animal = CAT;
		switch(animal) {
		case DOG:
			System.out.println("Dog");
			break;
		case CAT:
			System.out.println("Cat");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		}*/
		
		Animal animal = Animal.CAT; // not just CAT!
		switch(animal) {
		case CAT: // not Animal.CAT!
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		}
		
		// elements of enum are objects
		System.out.println(Animal.DOG); // result is DOG or what returns .toString()
		System.out.println(Animal.DOG.name()); // result is always DOG
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Enum);
		System.out.println(Animal.MOUSE.getName());
		
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2); 
		System.out.println(animal2.name());
		
	}

}
