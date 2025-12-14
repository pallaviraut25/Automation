package loopingstatement;

public class NestedLoop {

	public static void main(String[] args) {

		// nested for loop
		// outer loop--1 to 5--Row
		// inner loop--1 to 3--Col

		for (int a = 1; a <= 5; a++) {
			System.out.println("The value of outer loop is as:" + a);

			for (int b = 1; b <= 3; b++) {
				System.out.println(b);

			}

		}

		System.out.println("------------------------------");

		// outer loop--1 to 8
		// inner loop--1 to 5

		for (int c = 1; c <= 8; c++) {
			System.out.println("The value of outer loop is as:" + c);

			for (int d = 1; d <= 5; d++) {
				System.out.println(d);
			}

		}
		
		System.out.println("------------------------------------");
		
		//outer loop--1 to 3--row
		//inner loop--1 to 5--col
		
		for(int e=1;e<=3;e++) {
			System.out.println("The value of outer loop is as:"+e);
			
			for(int f=1;f<=5;f++) {
				System.out.println(f);
			}
		}
		
	}
}
