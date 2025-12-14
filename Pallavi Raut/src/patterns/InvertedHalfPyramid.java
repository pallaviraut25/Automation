package patterns;

public class InvertedHalfPyramid {

	public static void main(String[] args) {

		// outer loop-- 4 to 1--row
		// inner loop--we will check column condition with respect to row

		for (int r = 4; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println("---------------------------");

		// outer loop-- 10 to 1--row
		// inner loop--we will check column condition with respect to row

		for (int r = 10; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println("---------------------------");

		// outer loop-- 20 to 1--row
		// inner loop--we will check column condition with respect to row

		for (int r = 10; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println("------------with Numbers---------------");

		// outer loop-- 10 to 1--row
		// inner loop--we will check column condition with respect to row

		for (int r = 10; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c + "  ");
			}

			System.out.println();
		}

		System.out.println("---------------------------");

		// outer loop-- 30 to 1--row
		// inner loop--we will check column condition with respect to row

		for (int r = 30; r >= 1; r--) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c + "  ");
			}

			System.out.println();
		}

	}

}
