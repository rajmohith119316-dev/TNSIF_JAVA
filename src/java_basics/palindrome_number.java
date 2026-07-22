package java_basics;

import java.util.Scanner;

public class palindrome_number {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	int ori=num;
	int rev=0;
	if(num==0) {
		System.out.println("Number is empty");
	}
	while (num != 0) {
        int lastDigit = num % 10;         
        rev = (rev * 10) + lastDigit;      
        num = num / 10;                    
    }
	if(rev==ori) {
		System.out.println("palindrome");
	}
	sc.close();
	}
}
