package oops_concept;

class person{
	
}
class employee extends person{
	void salary() {
		
	}
}
class Manager extends employee{
	
}

public class InstanceOf {

	public static void main(String[] args) {
		Manager mn=new Manager();
		employee emp=new employee();
		person p=new person();
		System.out.println(emp instanceof employee);
		System.out.println(emp instanceof person);
		System.out.println(mn instanceof Manager);
		System.out.println(mn instanceof employee);
		System.out.println(mn instanceof person);
		System.out.println(p instanceof Manager);
		System.out.println(p instanceof employee);
		System.out.println(p instanceof person);
	}

}
