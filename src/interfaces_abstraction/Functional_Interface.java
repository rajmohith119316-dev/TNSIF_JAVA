package interfaces_abstraction;
//Function interface must have exactly one abstract method -> but many default and static methods .
@FunctionalInterface
interface Notification{
	void notifyuser(String message);

}

class EmailNotification implements Notification{

	@Override
	public void notifyuser(String message) {
		System.out.println("Email recvied:"+message);
	}
	
}
class SMSNotification implements Notification{

	@Override
	public void notifyuser(String message) {
		System.out.println("SMS Recvied:"+message);
	}
	
}
public class Functional_Interface {

	public static void main(String[] args) {
		Notification email =new EmailNotification();
		Notification sms =new EmailNotification();
		
		email.notifyuser("Meeting @ 10AM");
		sms.notifyuser("Kindly join");
		
	}

}
