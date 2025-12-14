package hierarchicalInheritance;

public class Student extends Parents {
	
	
	public void studentname() {
		
		System.out.println("Avani");
		
		System.out.println("Sejal");
		
	}

	public static void main(String[] args) {
		
		Student s=new Student ();
		
		s.parentsname();
		s.studentname();
		

	}

}
