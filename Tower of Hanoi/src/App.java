import java.util.ArrayList;

public class App {
	
	static int n = 1;
	static boolean isNOdd;
	

	static ArrayList<Integer> first = new ArrayList<>();
	static ArrayList<Integer> middle = new ArrayList<>();
	static ArrayList<Integer> last = new ArrayList<>();
	
	static void initiate() {
		
		interations = 0;
		
		isNOdd = isOdd(n);
		
		for(int j = n; j > 0; j--) {
			first.add(j);
		}
		
		System.out.println(n + " / " + isNOdd);
	}
	
	static boolean isOdd(int number) {
		return (number % 2) > 0;
	}
	
	static boolean isTheSame(int number) {
		return isNOdd == isOdd(number);
	}
	
	static int interations = 0;
	
	static void move(boolean same) {
		int firstTop = first.size()-1;
		int middleTop = middle.size()-1;
		int lastTop = last.size()-1;
		if(same) {
			if(lastTop < 0) {
				last.add( first.get(firstTop) );
				first.remove(firstTop);
			}
		}
		else {
			if(middleTop < 0) {
				middle.add( first.get(firstTop) );
				first.remove(firstTop);
			}
			else {
				if( !isTheSame(middle.get(middleTop)) ) {
					last.add( middle.get(middleTop) );
					middle.remove(middleTop);
				}
			}
		}
		
		dispaly();
		
		if( last.size() == n) {
			System.out.println("Success!");
			return;
		}
		
		interations++;
		if(interations > 5) return;
		
		if(same) {
			move(false);
		}
		else {
			move(true);
		}
		
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


