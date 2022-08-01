
public class App {

	public static void main(String[] args) {
		
		// examples of runtime exceptions 
		/*int value = 7;
		value /= 0;*/
		
		/*String text = null;
		System.out.println(text.length());*/
		
		/*String[] lines = {"one", "two", "three"};
		System.out.println(lines[3]);*/
		
		String[] lines = {"one", "two", "three"};
		
		try {
		System.out.println(lines[3]);
		} catch (Exception e) { // catch (RuntimeException e) // catch (ArrayIndexOutOfBoundsException e)
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}

}
