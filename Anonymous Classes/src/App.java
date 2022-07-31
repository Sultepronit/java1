class Machine {
	public void start() {
		System.out.println("Machine starting ...");
	}
}

interface Plant {
	public void grow();
}


public class App {

	public static void main(String[] args) {
		
		// anonymous class -- child of Machine
		Machine cam = new Machine() {
			@Override public void start() {
				System.out.println("Camera starting ...");
			}
		};
		
		cam.start();
		
		// didin't work
		//Plant plant = new plant();
		
		// anonymous class implementing interface Plant 
		Plant plant = new Plant() {

			public void grow() {
				System.out.println("Plant is growing...");
			}
			
		};
		
		plant.grow();
		

	}

}
