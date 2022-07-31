package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		File file = new File("text.txta");
		try {
			System.out.println("Start");
			
			FileReader fr = new FileReader(file);
			
			System.out.println("Continue");
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File: \"" + file.toString() + "\" not found");
		}
		
		System.out.println("Finish");

	}

}
