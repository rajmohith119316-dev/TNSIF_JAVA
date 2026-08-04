package oops_concept;
class addition{
	double  add(double a,double b) {
		System.out.println(a+b);
		return a+b;
	}
	int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	double  add(double a,double b,double c) {
		System.out.println(a+b+c);
		return a+b+c;
	}
	int add(int a, int b,int c) {
		System.out.println(a+b+c);

		return a+b+c;
	}
	
}
public class Polymorphism_1 {

	public static void main(String[] args) {
		addition add1= new addition();
		add1.add(1.1,2.1);
		add1.add(1.1,2.1,3);
		add1.add(1,2,1);
		add1.add(1,2);
		
	}

}
// POLYMORPHISM= METHOD CAN BE USED IN DIFFERENT WAYS DEPENDS ON THE SITUATION
// COMPILE TIME POLYMORPHISM=
//1) METHOD OVERLOADING
//2)CONSTRUCTOR AND OPERATOR OVERLOADING
//RUNTIME POLYMORPHISM
//METHOD OVERRIDING
