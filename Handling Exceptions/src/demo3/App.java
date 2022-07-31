package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't open file");
		}
	}
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("text.txta");
		FileReader fr = new FileReader(file);
	}

}
