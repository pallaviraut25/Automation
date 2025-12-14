package thisKeywordInheritance;

public class Student extends Employee {

	int emp_id = 15;

	public void name() {
		System.out.println("Name From Child Class");

	}

	public Student() {
		//if we have same method and variable we can access from Child class only
		this.name();
		System.out.println(this.emp_id);
		super.name();
		System.out.println(super.emp_id);
		System.out.println("Constructor From Child Class");
	}

	public static void main(String[] args) {
		Student s = new Student();

	}

}
