package oops_concept;

 

class ProductBottle
{
	double price;
	ProductBottle(double price)
	{
		this.price=price;
	}
	double calculateDiscount()
	{
		return this.price*0.10;
	}
	double calculateTotalPrice()
	{
		return this.price-this.calculateDiscount();
	}
}

public class Method_overiding {
	public static void main(String[] args) {
		ProductBottle product=new ProductBottle(400);
		System.out.println(" Final Price :"+product.calculateTotalPrice());
	}

}