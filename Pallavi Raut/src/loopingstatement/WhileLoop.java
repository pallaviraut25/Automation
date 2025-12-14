package loopingstatement;

public class WhileLoop {

	public static void main(String[] args) {
		
		//1 to 10

		int a = 1;
		while (a <= 10) {
			System.out.print(a + " ");
			//++a;
			a++;
		}
		
		System.out.println();
//10 to 1
		
		int b=10;
		while(b>=0) {
			System.out.print(b+" ");
			b--;
		}
	}

}
