package multiLevelInheritance;

public class Parents extends GrandParents {
	
	int age1=40;
	
	public void parentsname() {
		
		System.out.println("Vijay Raut");
		
		System.out.println("Madhuri Raut");
		
	}

	public static void main(String[] args) {
		
		Parents s=new Parents();
		
		s.grandparentsname();
		System.out.println(s.age);
		s.parentsname();
		System.out.println(s.age1);
		

	}

}
