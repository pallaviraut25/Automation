package patterns;

public class Zero_1 {

	public static void main(String[] args) {

		// Row 1 to 5

		for (int a = 1; a <= 5; a++) {

			for (int b = 1; b <= a; b++) {

				if ((a + b) % 2 == 0) {

					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}

			}

			System.out.println();

		}

		System.out.println("------------------------------");

		// Row 1 to 10

		for (int a = 1; a <= 10; a++) {

			for (int b = 1; b <= a; b++) {

				if ((a + b) % 2 == 0) {

					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}

			}

			System.out.println();

		}
		System.out.println("------------------------------");

		// Row 1 to 20

		for (int a = 1; a <= 20; a++) {

			for (int b = 1; b <= a; b++) {

				if ((a + b) % 2 == 0) {

					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.println();
		}
	}
}
