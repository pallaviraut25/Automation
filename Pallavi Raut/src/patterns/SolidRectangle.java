package patterns;

public class SolidRectangle {

	public static void main(String[] args) {
		
		
		//nested for loop
		
		//outer loop---1 to 4
		//inner loop--1 to 5
		
		for (int a=1;a<=4;a++) {
			//System.out.println(a);
			for (int b=1;b<=5;b++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		//outer loop--1 to 10 row
		//inner loop--1 to 15 coloum
		
		for (int c=1;c<=10;c++) {
			//System.out.println(c);
			for (int d=1;d<=15;d++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			
			
			 }
		
		System.out.println("-------------------------");
		
		//outer loop--1 to 4 row
		//inner loop--1 to 5 coloum
		
		for (int e=1;e<=4;e++) {
			//System.out.println(e);
		 for (int f=1;f<=5;f++) {
			 System.out.print(e + " ");
			 
			}
		 System.out.println();
				
			}
		
		System.out.println("----------------------------");
		
		//outer loop--1 to 10 row
	    //inner loop--1 to 5 coloum
		
		for (int g=1;g<=10;g++) {
			//System.out.println(g);
		 for (int h=1;h<=5;h++) {
			 System.out.print(g + " ");
			 
		
		}
		 System.out.println();
		
		}
		
	}
		
		
}


