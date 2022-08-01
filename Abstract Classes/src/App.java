
public class App {

	public static void main(String[] args) {
		
		Camera cam = new Camera();
		cam.setId(5);
		
		Car car = new Car();
		car.setId(7);
		
		// don't work because Machine is abstract!!! 
		//Machine mac = new Machine();
		
		car.run();

	}

}
