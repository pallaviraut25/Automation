package oops.inheritance;

public class Password extends Login {
	
	//Child Class

	int c = 23;

	public void name() {

		System.out.println("Enter Name");

	}

	public static void main(String[] args) {

		// 2. Object of parent Class
		// 3. We can use parent class ref. variable to hold or refer the child class object
		 
		// We need to build the relations
		

		Login p = new Password();
		System.out.println(p.a);
		p.test();
		p.test2();
		
		// 4. we can not used child class ref variable to parent class object
		
		//password w=new Login();


		
		/*  Login d=new Login();
		   d.test(); 
		   d.test2(); 
		   System.out.println(d.a);*/
		 
	}

}
