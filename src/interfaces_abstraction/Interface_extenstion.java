package interfaces_abstraction;

class Smart_light implements SmartDevice{

	@Override
	public void turnOn() {
			System.out.println("Device Turned ON");		
	}

	@Override
	public void turnOff() {
		System.out.println("Device Turned OFF");		
		
	}

	@Override
	public void getstatus() {
		System.out.println("Device Turned ON or OFF");		
		
	}
	
}
public class Interface_extenstion  {
	public static void main(String[]args) {
		SmartDevice smart= new Smart_light();
		smart.turnOn();
		smart.turnOff();
		smart.getstatus();
	}

}
