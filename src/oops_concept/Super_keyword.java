package oops_concept;
// super keyword for methods
class Payment1
{
	void process()
	{
		System.out.println("Processing payment using standard gateway");
	}
}
class GPay extends Payment1
{
	void process()
	{
		System.out.println("Processing payment via google pay");
	}
	void completeTransaction()
	{
		super.process();
		process();
	}
}

//Super keyword only for variables
class Notification 
{
	String message="Default Notification";
}
class PushNotification extends Notification
{
	String message="Push Notification from whatsapp";
	
	void showNotification()
	{
		System.out.println(super.message);
		System.out.println(message);
	}
}


public class Super_keyword {

	public static void main(String[] args) {
		GPay obj=new GPay();
		obj.completeTransaction();
		PushNotification obj1=new PushNotification(); 
		obj1.showNotification();

	}

}