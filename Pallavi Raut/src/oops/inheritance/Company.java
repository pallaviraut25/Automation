package oops.inheritance;

public class Company extends EmployeeName {

	// Child Class
	int a = 78;
	char c = 'R';

	public static void test() {
		System.out.println("Testing is Completed");

	}

	public static void main(String[] args) {

		Company t = new Company();

		t.name();
		System.out.println(t.s);

		t.test();
		System.out.println(t.a);
		System.out.println(t.c);

	}

}
