package if_statement;

public class If_else_If {

	public static void main(String[] args) {

		int a = 25;
		int b = 45;
		int c = 55;

		if (a > b && b > a) {
			System.out.println("A is the largest Number");
		} else if (b > a && b > c) {

			System.out.println("B is the largest Number");
		} else {
			System.out.println("C is the largest Number");
		}

	}

}
