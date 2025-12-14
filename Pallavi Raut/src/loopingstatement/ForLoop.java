package loopingstatement;

public class ForLoop {

	public static void main(String[] args) {

		// 1 to 10

		for (int a = 1; a <= 10; a++) {
			System.out.println(a + " ");
		}

		// 0 to 50

		for (int b = 0; b <= 50; b++) {
			// System.out.println(b+" ");
			System.out.print(b + " ");
		}
		// 1 to 30---even num

		for (int s = 1; s <= 30; s++) {
			if (s % 2 == 0)
				System.out.println(s + " ");
		}

		// PallaviRaut--10 times print

		// 1 to 10
		for (int d = 1; d <= 10; d++) {
			System.out.println("PallaviRaut");
		}

		System.out.println("----------------------");

		// 10 to 1

		for (int v = 10; v >= 1; v--) {
			System.out.println(v + " ");
		}

		System.out.println("-------------------------------");

		// Approach 3---print even number --1 to 10

		for (int k = 1; k <= 10; k++) {
			System.out.println(2 * k + " ");
		}

		System.out.println("----------------------------------");

//Approach 3---print odd number --1 to 10

		for (int k = 1; k <= 10; k++) {
			System.out.println(2 * k + 1 + " ");
		}
	}

}
