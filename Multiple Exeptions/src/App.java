import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {
	
	public static void main(String[] args) {
		
		Test test = new Test();
		
		// old method
		/*try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Couldn't parse command file.");
		}*/
		
		// new method
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// polymorphism: Exception is parent class of all exceptions 
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		// This autogenerated block has right order of catch blocks.
		// IOException is a parent of FileNotFoundException.
		// So if IOException would be first, FileNotFoundException would never be reached
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// didn't work!!!!
		/*try {
			test.input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// didn't work!!!!
		/*try {
			test.input();
		} catch (FileNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
