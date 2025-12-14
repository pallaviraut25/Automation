package singleLevelInheritance;

public class StudentsMarks extends StudentsName {

	// Child Class

	String str = "Marks";

	public void studentsmarks() {

		System.out.println("45");

		System.out.println("89");

		System.out.println("90");

	}

	public static void main(String[] args) {

		StudentsMarks e = new StudentsMarks();

		e.studentname();
		System.out.println(e.str);
		e.studentsmarks();

	}

}
