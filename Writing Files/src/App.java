import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		File file = new File("text.txt");
		
		try( BufferedWriter br = new BufferedWriter(new FileWriter(file)) ) {
		
			br.write("First line.");
			br.newLine();
			br.write("Second line.\n");
			br.write("Third line.\n");
			
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}

	}

}
