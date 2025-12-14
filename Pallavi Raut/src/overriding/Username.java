package overriding;

public class Username extends Login {
	
	public void personal() {
		System.out.println("Enter Personal Details from child class");

	}

	public void educationaldetails() {
		System.out.println("Enter Educationals Details from child class");

	}

	public void address() {
		System.out.println("Enter Address from child class");
	}

	public static void main(String[] args) {
		
		Username u=new Username();
		u.personal();
		u.educationaldetails();
		u.address();
		
		System.out.println("----------------------------------------------");
		
		//3rd Property of Inheritance
		
		Login t=new Username();
		t.address();
		t.educationaldetails();
		t.personal();
		
		System.out.println("-------------------------------------------------");
		
		//has-a-relationship
		
		Login n=new Login();
		n.address();
		n.educationaldetails();
		n.personal();
	}

}
