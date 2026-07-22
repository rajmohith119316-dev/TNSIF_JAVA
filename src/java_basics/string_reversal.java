package java_basics;

import java.util.Scanner;

public class string_reversal {
public static void main(String [] preran) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String:");
	StringBuilder s=new StringBuilder();
	s.append(sc.next());
	System.out.println(s.reverse().equals(s));
}
}  