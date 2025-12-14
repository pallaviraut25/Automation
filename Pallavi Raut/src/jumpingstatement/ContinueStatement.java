package jumpingstatement;

public class ContinueStatement {

	public static void main(String[] args) {
		
		//Continue for loop
		
		// 1 to 20
		
		for (int a=1;a<=20;a++) {
			if (a==16) {
				continue;
			}
			System.out.print(a+" ");
			
				
			
		}
		
		System.out.println();
		System.out.println("---------------------------");
		
		// 20 to 1
		
				for (int a=20;a>=1;a--) {
					if (a==7) {
						continue;
					}
					System.out.print(a+" ");
					
						
					
				}
				System.out.println();
				System.out.println("---------------------------");
				
				// 1 to 40
				
						for (int a=1;a<=40;a++) {
							if (a==34) {
								continue;
							}
							System.out.print(a+" ");
				
		
		
	}
						
						System.out.println();
						System.out.println("---------------------------");
						
						// Continue while loop
						
						//1 to 20
						
						int b=1;
						while (b<=20) {
							b++;
							if (b==15) {
								continue;
							}
							
							
							System.out.print(b+" ");
							
						}
						
						System.out.println();
						System.out.println("---------------------------");
						
						// Continue while loop
						
						//0 to 19
						
						int c=0;
						while (c<=19) {
							c++;
							if (c==15) {
								continue;
							}
							
							
							System.out.print(c+" ");
							

  }
						
						System.out.println();
						System.out.println("---------------------------");
						
						// Continue while loop
						
						//20 to 1
						
						int d=20;
						while (d>=1) {
							d--;
							if (d==15) {
								continue;
							}
							
							
							System.out.print(d+" ");
						
    }
						System.out.println();
						System.out.println("--------------------------");
						
						//Continue do while loop
						//1 to 20
						
						int e=1;
						do {
							e++;
							if (e==13) {
								continue;
							}
							System.out.print(e+" ");
							
						}while (e<=20);
						
						System.out.println();
						System.out.println("--------------------------");
						
						//Continue do while loop
						//19 to 0
						
						int f=19;
						do {
							f--;
							if (f==13) {
								continue;
							}
							System.out.print(f+" ");
							
						}while (f>=0);
						
						System.out.println();
						System.out.println("--------------------------");
						
						//Continue do while loop
						//1 to 40
						
						int g=1;
						do {
							g++;
							if (g==33) {
								continue;
							}
							System.out.print(g+" ");
							
						}while (g<=40);	
  }
}