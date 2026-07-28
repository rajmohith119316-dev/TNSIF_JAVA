package oops_concept;
class parent{
	String name="parent";
	int age=50;
	int phno=12345;
	String Adress="world";
	void characteristics() {
		System.out.println("Name:"+name+" age:"+age+" phno:"+phno+" Adress:"+Adress+"");
	}
}
class child extends parent{
	String name="child";
	int age=20;
	int phno=123456;
	String Adress="world";
	void characteristics_biodata() {
		System.out.println("Name:"+name+" age:"+age+" phno:"+phno+" Adress:"+Adress+"");
	}
}
public class single_inheritance {

	public static void main(String[] args) {
			child ch=new child();
			ch.characteristics();
			ch.characteristics_biodata();
	}

}
