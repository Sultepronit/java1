import java.util.ArrayList;
import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		
		////////////////// Before java 5(?)
		ArrayList fruits = new ArrayList();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");
		
		String fruit = (String) fruits.get(1);
		System.out.println(fruit);
		
		//////////////////// After java 5
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("human");
		
		String animal = animals.get(1);
		System.out.println(animal);
		
		/////////////////// Since java 7
		ArrayList<String> list = new ArrayList<>();
		
		//////////////////// Several types of arguments
		HashMap<Integer, String> map = new HashMap<Integer, String>();

	}

}
