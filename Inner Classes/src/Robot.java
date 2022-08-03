
public class Robot {
	private int id;
	
	// should be private and are used to group some variables and methods inside the class
	public class Brain {
	//private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	
	// is full-fledged class only that it is part of Robot.
	public static class Battery {
		public void charge() {
			System.out.println("Battery is charging.");
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		
		Brain brain = new Brain();
		brain.think();
		
		//must be final no have access within the Temp class???
		/*final*/ String name = "Robin";
		
		class Temp {
			public void doSomething() {
				System.out.println("Id is: " + id);
				System.out.println("My name is: " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}
	
	
}
