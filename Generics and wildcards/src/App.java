import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a camera";
	}
}


public class App {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		
		showList(list);
		
		ArrayList<Machine> list2 = new ArrayList<>();
		list2.add(new Machine());
		list2.add(new Machine());
		
		showList2(list2);

	}
	
	public static void showList(ArrayList<String> list) {
		for(String value : list) {
			System.out.println(value);
		}
	}
	
	public static void showList2(ArrayList<Machine> list) {
		for(Machine value : list) {
			System.out.println(value);
		}
	}

}
