package patterns;

public class HalfPyramid {

	public static void main(String[] args) {

		// outer loop--row--1 to 4
		// inner loop--column-- we will check column condition with respect to row

		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		// outer loop--row--1 to 10
		// inner loop--column-- we will check column condition with respect to row

		for (int r = 1; r <= 10; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		// outer loop--row--1 to 20
		// inner loop--column-- we will check column condition with respect to row

		for (int r = 1; r <= 20; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("--------with Numbers---------------");

		// outer loop--row--1 to 20
		// inner loop--column-- we will check column condition with respect to row

		for (int r = 1; r <= 20; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}
}
