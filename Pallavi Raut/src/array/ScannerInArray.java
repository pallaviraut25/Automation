package array;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerInArray {

	public static void main(String[] args) {

		int[] a = new int[5];

		Scanner sc = new Scanner(System.in);

		// for loop

		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
			// sc.nextInt();
		}

		System.out.println(Arrays.toString(a));

		sc.close();
	}

}
