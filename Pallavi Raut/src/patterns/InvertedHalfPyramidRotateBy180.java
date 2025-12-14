package patterns;

public class InvertedHalfPyramidRotateBy180 {

	public static void main(String[] args) {

		// Row--1 to 4

		for (int a = 1; a <= 4; a++) {

			// to print space

			for (int b = 1; b <= 4 - a; b++) {
				System.out.print("  ");
			}

			// to print *
			for (int c = 1; c <= a; c++) {
				System.out.print("* ");

			}
			System.out.println();

		}

		System.out.println("-----------------------");

		// Row--1 to 11

		for (int a = 1; a <= 11; a++) {

			// to print space

			for (int b = 1; b <= 11 - a; b++) {
				System.out.print("  ");
			}

			// to print *
			for (int c = 1; c <= a; c++) {
				System.out.print("* ");

			}
			System.out.println();

		}

		System.out.println("-----------------------");

		// Row--1 to 50

		for (int a = 1; a <= 50; a++) {

			// to print space

			for (int b = 1; b <= 50 - a; b++) {
				System.out.print("  ");
			}

			// to print *
			for (int c = 1; c <= a; c++) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}

}