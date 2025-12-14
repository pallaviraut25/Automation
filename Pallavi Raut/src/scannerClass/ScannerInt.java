package scannerClass;

import java.util.Scanner;

public class ScannerInt {

	public static void main(String[] args) {
		
		// Addition of two Number

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first value:");
		int a = sc.nextInt();

		System.out.println("Enter second value:");
		int b = sc.nextInt();

		System.out.println("Addition of two Number is as:");
		int c = a + b;
		System.out.println(c);
		
		//Multiplication of two Numbers

		System.out.println();
		System.out.println("---------Multiplication of two Numbers-----------");

		System.out.println("Enter first value:");
		int d = sc.nextInt();

		System.out.println("Enter second value:");
		int e = sc.nextInt();

		System.out.println("Multiplication of two Number is as:");
		int f = d * e;
		System.out.println(f);
		
		//Substraction of two Number

		System.out.println();
		System.out.println("---------Substraction of two Numbers-----------");

		System.out.println("Enter first value:");
		int g = sc.nextInt();

		System.out.println("Enter second value:");
		int h = sc.nextInt();

		System.out.println("Substraction of two Number is as:");
		int i = g - h;
		System.out.println(i);
		
		sc.close();
	}

}
