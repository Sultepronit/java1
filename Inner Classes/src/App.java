
public class App {

	public static void main(String[] args) {
		
		Robot robot = new Robot(4);
		robot.start();
		
		// working only if inner class Brain is public
		// it's very strange thing, not to use it, but to just know
		Robot.Brain brain = robot.new Brain();
		brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();

	}

}
