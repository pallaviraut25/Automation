package array;

public class multiArrayInt {

	public static void main(String[] args) {

		// multi dimentional array

		int[][] a = new int[2][3];

//size=size of row*size of col=2*3=6
		// memory allocation int 4 byte*2*3=24

		// row--0 to 1---outer loop
		// column--0 to 2--inner loop

		a[0][0] = 15;
		a[0][1] = 16;
		a[0][2] = 17;

		a[1][0] = 18;
		a[1][1] = 19;
		a[1][2] = 15;

		// Nested for loop

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("----------------------------------");

		// System.out.println("length:"+a.length);
		System.out.println("Value at res index is as:" + a[1][0]);

		System.out.println("--------------------------------------");

		int[][] b = new int[5][7];

		// memory allocation int 4 byte *5*7=140

		// row--0 to 4--outer loop
		// column--0 to 6--inner loop

		b[0][0] = 89;
		b[0][1] = 67;
		b[0][2] = 78;
		b[0][3] = 90;
		b[0][4] = 56;
		b[0][5] = 34;
		b[0][6] = 88;

		b[1][0] = 34;
		b[1][1] = 70;
		b[1][2] = 45;
		b[1][3] = 89;
		b[1][4] = 37;
		b[1][5] = 78;
		b[1][6] = 23;

		b[2][0] = 89;
		b[2][1] = 56;
		b[2][2] = 20;
		b[2][3] = 80;
		b[2][4] = 81;
		b[2][5] = 83;
		b[2][6] = 85;

		b[3][0] = 45;
		b[3][1] = 67;
		b[3][2] = 89;
		b[3][3] = 56;
		b[3][4] = 80;
		b[3][5] = 30;
		b[3][6] = 50;

		b[4][0] = 89;
		b[4][1] = 56;
		b[4][2] = 89;
		b[4][3] = 90;
		b[4][4] = 89;
		b[4][5] = 55;
		b[4][6] = 88;

		// Nested for loop

		for (int n = 0; n < 5; n++) {
			for (int m = 0; m < 7; m++) {
				System.out.print(b[n][m] + " ");
			}

			System.out.println();
		}

		System.out.println("Value of res index is as:" + b[4][6]);

	}

}
