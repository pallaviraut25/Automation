package scannerClass;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Switch Operators--+,-,*,/,%

		System.out.println("Enter First Number:");
		int a = sc.nextInt();

		System.out.println("Enter Second Number:");
		int b = sc.nextInt();

		char c = sc.next().charAt(0);
		
		System.out.println("Switch any operator according to condition:");

		switch (c) {

		case '+':
			System.out.println("Addition of two number is:" + (a + b));
			break;
		case '-':
			System.out.println("Substraction of two number is:" + (a - b));
			break;
		case '*':
			System.out.println("Multiplication of two number is:" + (a * b));
			break;
		case '/':
			System.out.println("Division of two number is:" + (a / b));
			break;
		case '%':
			System.out.println("Modulo of two number is:" + ((a + b) % 2 == 0));
			break;
		default:
			System.out.println("None");
			break;
        
		
		}
		sc.close();
	}

}
