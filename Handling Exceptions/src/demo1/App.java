package demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("text.txta");
		FileReader fr = new FileReader(file);
		
	}

}
