import java.util.ArrayList;

class Tower {
	public int top;
	public int value;
	public boolean sameAsBase;
	
	public Tower(int top, int value, boolean sameAsBase) {
		this.top = top;
		this.value = value;
		this.sameAsBase = sameAsBase;
	}
}

public class App2 {
	
	static int n = 1;
	static boolean isNOdd;
	
	static ArrayList<Integer> first = new ArrayList<>();
	static ArrayList<Integer> middle = new ArrayList<>();
	static ArrayList<Integer> last = new ArrayList<>();
	
	static Tower firstT;
	static Tower middleT;
	static Tower lastT;
	
	static void initiate() {
		interations = 0;
		isNOdd = isOdd(n);
		for(int j = n; j > 0; j--) {
			first.add(j);
		}
		System.out.println(n + " / " + isNOdd);
		firstT = new Tower(n-1, 1, isNOdd);
		middleT = new Tower(-1, 0, false);
		lastT = new Tower(-1, 0, true);
	}
	
	static boolean isOdd(int number) {
		return (number % 2) > 0;
	}
	
	static boolean isTheSame(int number) {
		return isNOdd == isOdd(number);
	}
	
	static int interations = 0;
	
	static void move(boolean same) {
		
	}
	
	private static void start(int number)
	{	
		n = number;
		last.clear();
		initiate();
		dispaly();
		move( isNOdd );
	}

	public static void main(String[] args) {
		// I know that I must do it, and I know that it should be done with a recursive method
		// But I still don't understand what to do...
		
		start(1);
		start(2);
		start(3);
		
		//System.out.println("hey!");
	}
	
	public static void dispaly() {
		for(int i = n - 1; i >= 0; i--) {
			displayChar(first, i);
			displayChar(middle, i);
			displayChar(last, i);
			System.out.println();
		}
		System.out.println();
	}
	
	static void displayChar(ArrayList<Integer> list, int index) {
		 if(index >= list.size()) {
			 System.out.print(".");
		 }
		 else {
			 System.out.print(list.get(index));
		 }
		 System.out.print(" ");
	}

}


