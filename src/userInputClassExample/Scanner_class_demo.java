package userInputClassExample;
import java.util.*;



public class Scanner_class_demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String Name=sc.nextLine();
		System.out.println("Enter Age:");
		int Age=sc.nextInt();
		System.out.println("Name:"+Name);
		int index=0;
		char c=sc.next().charAt(0);
		for(int i=0;i<Name.length();i++) {
			if(Name.charAt(i)==c) {
				index=i;
			}
		}
		System.out.println("Index is :"+index);
		System.out.println("charAT:"+c);
		sc.close();
	}

}
