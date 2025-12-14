package hierarchicalInheritance;

public class Teacher extends Parents {
	
	
	public void Teachername() {
		
		System.out.println("Payal Mam");
		
		System.out.println("Harsha Mam");
		
	}

	public static void main(String[] args) {
		
		Teacher t=new Teacher();
		
		t.parentsname();
		t.Teachername();
		

	}

}
