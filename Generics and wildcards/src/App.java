import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a camera";
	}
	
	public void snap() {
		System.out.println("Snap!");
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
		
		ArrayList<Camera> list3 = new ArrayList<>();
		list3.add(new Camera());
		list3.add(new Camera());
		
		// not working
		//showList2(list3);
		
		showList3(list3);
		
		showList4(list2);
		
		showList4(list3);
		
		showList5(list3);
		
		showList3(list);
		
		//showList6(list); // editor shows error
		// works only with Camera & its superclass Machine
		showList6(list2);
		showList6(list3);
		
		//showList5(list); // runtime error

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
	
	public static void showList3(ArrayList<?> list) {
		for(Object value : list) {
			System.out.println(value);
		}
	}
	
	public static void showList4(ArrayList<? extends Machine> list) {
		for(Machine value : list) {
			System.out.println(value);
			value.start();
			// can't work
			//value.snap();
		}
	}
	
	public static void showList5(ArrayList<?> list) {
		for(Object value : list) {
			System.out.println(value);
			
			Machine mach = (Machine) value;
			mach.start();
			
			Camera cam = (Camera) value;
			cam.snap();
		}
	}
	
	public static void showList6(ArrayList<? super Camera> list) {
		for(Object value : list) {
			System.out.println(value);
			
			/*Machine mach = (Machine) value;
			mach.start();
			
			Camera cam = (Camera) value;
			cam.snap();*/
		}
	}

}
