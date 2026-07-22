package tns.org.java;
class Person {
	  private String name; // private = restricted access

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	}
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Person s=new Person();
		System.out.println(s.getName());
		s.setName("Preran");
		System.out.println(s.getName());
		
		
		}
}
