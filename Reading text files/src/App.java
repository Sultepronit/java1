import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		//String fileName = "/home/step/Main/java1/Text.txt";
		String fileName = "Text.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		int number = in.nextInt();
		in.nextLine(); // read the invisible symbols
		
		System.out.println("First line number: " + number);
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println(line);
		}
		
		in.close();

	}

}
