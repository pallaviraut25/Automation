package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
	//Logical operators
		//Logical and--&&
		//Logical or--||
		//Logical Operator not--!
		
		//Logical and--&&
		
		int a=90;
		int b=20;
		//true true--true
		boolean c=a>b&&b<a;
		System.out.println(c);
		
		
		//true false--false
		
		boolean d=a>b&&b>a;
		System.out.println(d);
		
		//false true--false
		
		boolean f=b>a&&a>b;
		System.out.println(f);
		
		//false false--false
		
		boolean h=a>b&&b>a;
				
				System.out.println(h);
				
				
				System.out.println("-----------------------------");
				
				//Logical or--||
				
				//true true--true
				
				boolean e=a>b||b<a;
				System.out.println(e);
				
				//true false
				
				boolean j=a>b||b>a;
				System.out.println(j);
				
				//false true
				
				boolean k=a<b||b<a;
				System.out.println(k);
				
				//false false
				
				boolean l=a<b||b>a;
				System.out.println(l);
				
				System.out.println("---------------------------");
				
				//logical not
				
				int z=100;
				System.out.println(z!=100);
				
				
				String s="institute";
				System.out.println(s!="institute");
				
				
				
				
				
	}

}
