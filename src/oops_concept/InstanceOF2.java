package oops_concept;


class PaymentMethod
{
	void makePayment()
	{
		System.out.println("Processing payment");
	}
}
class CreditCard extends PaymentMethod
{
	void swipeCard()
	{
		System.out.println(" Swiping credit card");
	}
}

class Paypal extends PaymentMethod
{
	void loginToPaypal()
	{
		System.out.println(" logging into paypal");
	}
}
public class InstanceOF2 {

	public static void main(String[] args) {
		PaymentMethod payment=new PaymentMethod();
		
		payment=new  CreditCard();
		payment =new Paypal();
		
		if(payment instanceof CreditCard)
		{
			CreditCard cc=(CreditCard)payment;
			cc.swipeCard();
		}
		else if(payment instanceof Paypal)
		{
			Paypal pp=(Paypal)payment;
			pp.loginToPaypal();
		}	
		else {
			System.out.println("Error in payment");
		}
	}

}

