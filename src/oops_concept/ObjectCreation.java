package oops_concept;

public class ObjectCreation {
	private double price;
	String FoodName;
	String Category;
	public double getprice() {
		return price;
	}
	public double setprice(double price) {
		return this.price=price;
	}
	 void   Menu() {
		System.out.println("order please");
		System.out.println("Food Name :"+FoodName);
		System.out.println("Food Category :"+Category);
		System.out.println("Price:"+price);
	}
	public static void main(String[] args) {
		ObjectCreation oc= new ObjectCreation();
		oc.setprice(100.2);
		oc.Menu();
		System.out.println(oc.getprice());
	}

}
