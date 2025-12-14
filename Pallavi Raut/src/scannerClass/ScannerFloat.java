package scannerClass;

import java.util.Scanner;

public class ScannerFloat {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		System.out.println("Enter first value:");
		float b = a.nextFloat();

		System.out.println("Enter second value:");
		float c = a.nextFloat();

		System.out.println("Addition of two numbers is as:");
		float d = b + c;
		System.out.println(d);

		System.out.println();
		System.out.println("-----------Substraction of two Numbers-----------");

		System.out.println("Enter first value:");
		float e = a.nextFloat();

		System.out.println("Enter second value:");
		float f = a.nextFloat();

		System.out.println("Substraction of two numbers is as:");
		float g = e - f;
		System.out.println(g);

		System.out.println();
		System.out.println("----------Multiplication of two numbers-----------");

		System.out.println("Enter first value:");
		float h = a.nextFloat();

		System.out.println("Enter second value:");
		float i = a.nextFloat();

		System.out.println("Addition of two numbers is as:");
		float j = h * i;
		System.out.println(j);

		a.close();

	}

}
