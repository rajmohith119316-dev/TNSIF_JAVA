package java_basics;

import java.util.Scanner;

public class reversal_of_string {
public static void main (String []preran) {
	Scanner sc= new Scanner(System.in);
	String reversed= "";
	System.out.println("Enter the String:");
	String s=sc.next();
	if(s==null||s.isEmpty()) {
		System.out.println("Cannot reverse empty string");
	}
	char ch[]=s.toCharArray();
	for(int i=s.length()-1;i>=0;i--){
		reversed+=ch[i];
	}
	System.out.println(reversed);
	sc.close();
}
}
