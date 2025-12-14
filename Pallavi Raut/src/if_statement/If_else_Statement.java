package if_statement;

public class If_else_Statement {

	public static void main(String[] args) {
		
		int person_age=17;
		
		if (person_age>=18) {
			System.out.println("Eligible for vote");
		} else {
			System.out.println("Not Eligible for vote");
		}
		
		System.out.println("------------Even Numbers--------------");
		
		// 10%2==0--Even Numbers
		//11%2 !=0--Odd Numbers
		
		int a=10;
		if(a%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
		
System.out.println("------------Even Numbers--------------");
		
		// 10%2==0--Even Numbers
		//11%2 !=0--Odd Numbers
		
		int a1=11;
		if(a1%2!=0) {
			System.out.println("Odd Number");
		}else {
			System.out.println("Even Number");
		}
	}

}
