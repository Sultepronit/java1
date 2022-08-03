import java.util.Objects;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}

public class App {

	public static void main(String[] args) {

		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(7, "Sue");
		Person person3 = new Person(5, "Bob");

		// comparing just references not the objects!
		System.out.println(person1 == person2);
		System.out.println(person1 == person3);

		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));

		Integer int1 = 75;
		Integer int2 = 75;
		System.out.println("Integer: " + (int1 == int2));
		int1 += 2;
		int2 += 2;
		System.out.println("Integer: " + (int1 == int2));

		Double double1 = 7.5;
		Double double2 = 7.5;
		System.out.println("Double: " + (double1 == double2));

		double double01 = 7.5;
		double double02 = 7.5;
		System.out.println("double: " + (double01 == double02));
		
		String string1 = "Hello!";
		String string2 = "Hello!";
		System.out.println(string1 == string2);
		
		/*string1 = string1 + "!!";
		string2 = string2 + "!!";
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));*/
		
		string1 = string1.substring(0,5);
		string2 = string2.substring(0,5);
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));
		
		

	}

}
