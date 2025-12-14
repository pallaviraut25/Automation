package scannerClass;

import java.util.Scanner;

public class ScannerChar {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		char a =sc.next().charAt(0);
		
		System.out.println("Enter the first Alphabete:");
		
		char b = sc.next().charAt(0);
		
		System.out.println("Enter the second Alphabete");
		
	  char	c= sc.next().charAt(0);
	  
	  System.out.println("join two alphabete"+(a+b));
		
		sc.close();
		
		

	}

}
