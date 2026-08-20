package collectiondemo;
//Comparable interface in Java defines compareTo() method for comparing objects of the same type. --Natural ordering sorter A-z and 1- n
//Comparator in Java is an interface whose task is to compare objects of a user-defined class .

//Use of Comparable: Can only define one sorting order (natural order).
//Use of Comparator: Can define multiple sorting orders for the same class.

import java.util.ArrayList;
import java.util.Collections;

class Person5 implements Comparable<Person5>
{

	String name;
	int age;
	
	public Person5(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

     void display()
     {
    	 System.out.println("Name :"+name + " , Age :"+age);
     }
	
	@Override
	public int compareTo(Person5 o) {
	
		return this.name.compareTo(o.name);
	}
	
}

public class Comparable_interface_Demo {

	public static void main(String[] args) {
		ArrayList<Person5> people =new ArrayList<>();
		
		people.add(new Person5("John",27));
		people.add(new Person5 ("Anil",30));
		people.add(new Person5 ("Baskar",17));
		
		System.out.println("Sort by Name");
		
		Collections.sort(people);
		
		for(Person5 person:people)
		{
			person.display();
		}
		
	}

}