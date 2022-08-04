import java.util.ArrayList;

class Tower {
	public int top;
	public int value;
	public boolean sameAsBase;
	ArrayList<Integer> list = new ArrayList<>();
	
	public Tower(int top, int value, boolean sameAsBase) {
		this.top = top;
		this.value = value;
		this.sameAsBase = sameAsBase;
	}
}

public class App2 {
	
	static int n = 1;
	static boolean isNOdd;
	
	static Tower first;
	static Tower middle;
	static Tower last;
	
	static void initiate() {
		interations = 0;
		
		isNOdd = isOdd(n);
		System.out.println(n + " / " + isNOdd);
		
		first = new Tower(n-1, 1, isNOdd);
		middle = new Tower(-1, 0, true);
		last = new Tower(-1, 0, false);
		
		for(int j = n; j > 0; j--) {
			first.list.add(j);
		}

		
	}
	
	static boolean isOdd(int number) {
		return (number % 2) > 0;
	}
	
	/*static boolean isTheSame(int number) {
		return isNOdd == isOdd(number);
	}*/
	
	static int interations = 0;
	
	static void moveStep(Tower from, Tower to) {
		to.top++;
		to.value = from.value;
		to.sameAsBase = !to.sameAsBase;
		to.list.add(from.value);
		
		from.list.remove(from.top--);
		from.value = (from.top >= 0) ? from.list.get(from.top) : 0;
		from.sameAsBase = !from.sameAsBase;
	}
	
	static void move() {
		do {
			if(last.value == 0) {
				if(first.sameAsBase) {
					moveStep(first, last);
					break;
				}
			}
			if(middle.value == 0) {
					if(!first.sameAsBase) {
						moveStep(first, middle);
						break;
					}
			}
			if(middle.value > 0) {
				if(!middle.sameAsBase) {
					moveStep(middle, last);
					break;
				}
		}
		}
		while(false);
	
		
		dispaly();
		
		if(last.top == n-1) {
			System.out.println("Success!");
			return;
		}
		
		interations++;
		if(interations > 4) return;
		
		move();
	}
	
	private static void start(int number)
	{	
		n = number;
		initiate();
		dispaly();
		move();
	}

	public static void main(String[] args) {
		// I know that I must do it, and I know that it should be done with a recursive method
		// But I still don't understand what to do...
		
		start(1);
		start(2);
		//start(3);
		
		//System.out.println("hey!");
	}
	
	public static void dispaly() {
		for(int i = n - 1; i >= 0; i--) {
			displayChar(first.list, i);
			displayChar(middle.list, i);
			displayChar(last.list, i);
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


