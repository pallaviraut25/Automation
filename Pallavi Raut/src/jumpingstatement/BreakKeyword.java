package jumpingstatement;

public class BreakKeyword {

	public static void main(String[] args) {

		// Break keyword in for loop

		// 1 to 10

		for (int a = 1; a <= 10; a++) {
			System.out.print(a + " ");
			if (a == 7) {
				break;
			}
		}
		System.out.println();

		// 10 to 1
		for (int b = 10; b >= 1; b--) {
			System.out.print(b + " ");
			if (b == 6) {
				break;
			}
		}
		System.out.println();
		// 0 to 50

		for (int c = 0; c <= 50; c++) {
			System.out.print(c + " ");
			if (c == 45) {
				break;
			}
		}
		System.out.println();
		System.out.println("----------Break keyword in while-----------");
		
		//Break keyword in while loop
		
		//10 to 1
		int a=10;
		while(a>=1) {
			System.out.print(a+" ");
			if (a==7) {
				break;
			}
			a--;
		}
		
		System.out.println();
		
		// 50 to 1
		int b=50;
		while(b>=1) {
			System.out.print(b+" ");
			if (b==34) {
				break;
			}
				b--;
			}
		
		System.out.println();
		System.out.println("------Break keyword in do while ---------------");
		
		//Break keyword in do while loop
		//25 to 10
		int c=25;
		do {
			System.out.print(c+" ");
			if (c== 18) {
				break;
			}
			c--;
			
		}
		while(c>=10);
		
		System.out.println();
		
		//50 to 5
		int d=50;
		do {
		  System.out.print(d+" ");
			if (d== 18) {
				break;
			 }
			d--;
					
				}
				while(d>=5);
				

	}
}