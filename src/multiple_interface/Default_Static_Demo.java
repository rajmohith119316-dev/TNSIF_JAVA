package multiple_interface;

interface Vehicle{
	void start();
	void stop();
	int max_speed=150;
	
	default void repair() {
		System.out.println("Vehicle repair is done here");
	}
	static void checkMaintanence() {
		System.out.println("Vehicle Maintanance taken care here");
	}
}

class Car implements Vehicle{
	private String model;
	
	Car(String model){
		this.model=model;
	}
	@Override
	public void start() {
			System.out.println(model+" car is Starting");
	}

	@Override
	public void stop() {
		System.out.println(model+" car is Stoping");
		
	}
	
}

class Bike implements Vehicle{
	private String model;
	
	Bike(String model){
		this.model=model;
	}

	@Override
	public void start() {
		System.out.println(model+" Bike is Starting");
		
	}

	@Override
	public void stop() {
		System.out.println(model+" Bike is Stoping");
		
	}
}
public class Default_Static_Demo {

	public static void main(String[] args) {
		Vehicle v=new Car("Nexa");
		Vehicle v1=new Bike("Honda");
		v.start();
		v.stop();
		v1.start();
		v1.stop();
		v.repair();
		Vehicle.checkMaintanence();
		v1.repair();
		System.out.println(Vehicle.max_speed);
	}

}
