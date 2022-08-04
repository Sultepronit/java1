
public class App {

	public static void main(String[] args) {
		
		//calculate(5);
		
		System.out.println(calculateFactorial(5));

	}
	
	public static void calculate(int value) {
		System.out.println(value);
		
		if(value == 1) {
			return;
		}
		
		calculate(value - 1);
	}
	
	public static int calculateFactorial(int value) {
		System.out.println(value);
		
		if(value == 1) {
			return 1;
		}
		
		return value * calculateFactorial(value - 1);
	}

}
