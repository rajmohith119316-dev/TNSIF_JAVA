package oops_concept;
class human{
	private int age;
	private String Name;
	private String Gender;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getGender() {
		return Gender;
	}
	
	public void setGender(String gender) {
		Gender = gender;
	}
	
}
public class Human_features {

	public static void main(String[] args) {
		human hu =new human();
		hu.setName("Human");
		hu.setAge(100);
		hu.setGender("Male");
		System.out.println(hu.getAge()); 
		System.out.println(hu.getGender()); 
		System.out.println(hu.getName());
		
		hu.setName("Non Human");
		hu.setAge(101);
		hu.setGender("FeMale");
		System.out.println(hu.getAge()); 
		System.out.println(hu.getGender()); 
		System.out.println(hu.getName());

		
	}

}
