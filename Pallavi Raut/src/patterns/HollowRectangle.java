package patterns;

public class HollowRectangle {

	public static void main(String[] args) {
		
		
		//outer loop--row--1 to 4--r
		//inner loop--column--1 to 5--c
		//nested for loop
		
		for (int r=1;r<=4;r++) {
			
			for (int c=1;c<=5;c++) {
				if (r==1||r==4||c==1||c==5)
					System.out.print("* ");
				
			 else {
				
				System.out.print("  ");
		}
		
	}
		System.out.println();
	
	}
		
		System.out.println("--------------------------------");
		
		//outer loop--1 to 6--row
		//inner loop--1 to 7--column
		
		for (int a=1;a<=6;a++) {
			
			for (int b=1;b<=7;b++) {
				if (a==1||a==6||b==1||b==7)
					System.out.print("* ");
			 else {
				System.out.print("  ");
			}
			
			
		}
			System.out.println();
		
		
}
System.out.println("--------------------------------");
		
		//outer loop--1 to 10--row
		//inner loop--1 to 12--column
		
		for (int a=1;a<=10;a++) {
			
			for (int b=1;b<=12;b++) {
				if (a==1||a==10||b==1||b==12)
					System.out.print("* ");
			 else {
				System.out.print("  ");
			}
			
			
		}
			System.out.println();
	
}
		System.out.println("------------------------------");
		
		//outer loop--row--1 to 4--r
				//inner loop--column--1 to 5--c
				//nested for loop
				
				for (int r=1;r<=4;r++) {
					
					for (int c=1;c<=5;c++) {
						if (r==1||r==4||c==1||c==5)
							System.out.print("5 ");
						
					 else {
						
						System.out.print("  ");
				}
				
			}
				System.out.println();
	
}
}
}