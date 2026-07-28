package oops_concept;

class Device
{
	void deviceType()
	{
		System.out.println("I am an electronic Device");
	}
	
}
class Phone extends Device
{
	void brand()
	{
		System.out.println("Brand : Samsung");
	}
}

class SmartPhone extends Phone
{
	void features()
	{
		System.out.println("Features : Touchscreen,Camera ,Internet");
	}
}
public class multilevel_inheritance {

	public static void main(String[] args) {
		SmartPhone smart=new SmartPhone();
		smart.deviceType();
		smart.brand();
		smart.features();
	}

}