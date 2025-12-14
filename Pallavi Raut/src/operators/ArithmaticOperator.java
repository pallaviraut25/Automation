package operators;

public class ArithmaticOperator {

	public static void main(String[] args) {

		// Addition

		int a = 5;
		int b = 9;
		int c = a + b;

		System.out.println(c);

		// Substraction

		int d = 90; // 4
		float e = 40.67f; // 4

		float f = d - e;

		System.out.println(f);

		// Division--Quotient---9/8---forward slash---Reminder-10%2

		int o = 57;
		byte q = 20;

		int i = o / q;
		int g = o % q;

		System.out.println(i);
		System.out.println(g);

		// multiplication

		double h = 78.77;
		float j = 45.67f;

		double k = h * j;

		System.out.println(k);

		System.out.println("----------------------------");

		// increment--(++)

		int v = 90;
		System.out.println("The incremented value is as:" + (++v));
		System.out.println(++v);

		// Decrement--(--)

		int n = 87;
		System.out.println("The decermented value is as:" + (--n));
		System.out.println(--n);

	}

}
