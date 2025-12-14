package scannerClass;

import java.util.Scanner;

public class TableOf {

	public static void main(String[] args) {
		
		// To Print table
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number to print its Table:");
		
	int a = sc.nextInt();
	
	System.out.println("Table of " + a +":");
	
	for (int b=1;b<=10;b++) {
		System.out.println(a +" * "+ b +" = " +(a*b));
	}
	
	sc.close();
	}

}
