package array;

public class TwoDArrayWithoutAllocatingMemory {

	public static void main(String[] args) {

		// 4 row and 2 column

		int[][] a = { { 34, 45 }, { 56, 78 }, { 45, 23 }, { 67, 90 } };

		// Nested for loop

		// row--0 to 3--outer loop
		// col--0 to 1--inner loop

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}

		// System.out.println("Length:"+a.length);
		System.out.println("Value:" + a[3][1]);

		System.out.println("-----------------------------");

		// 5 row and 8 column

		float[][] b = { { 34.3f, 67.9f, 56.7f, 54.7f, 34.7f, 34.6f, 90.6f, 56.7f },
				{ 69.8f, 45.7f, 89.9f, 34.7f, 87.5f, 58.7f, 67.9f, 48.8f },
				{ 34.3f, 67.9f, 56.7f, 54.7f, 94.7f, 34.6f, 90.6f, 56.7f },
				{ 43.7f, 27.5f, 54.8f, 54.7f, 54.3f, 37.7f, 99.3f, 57.3f },
				{ 44.3f, 87.9f, 52.7f, 54.7f, 34.7f, 38.6f, 96.8f, 50.7f } };
		
		//row--0 to 4
		//col--0 to 7
		
		//Nested for loop
		
		for(int m=0;m<5;m++) {
			for(int n=0;n<8;n++) {
				
				System.out.print(b[m][n]+" ");
				
			}
			
			System.out.println();
		}
		
		System.out.println("value:"+b[4][4]);
	}
}
