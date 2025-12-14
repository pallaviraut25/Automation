package oops.inheritance;

public class Username extends Login {
	
	// Child Class

	int b = 24;

	public void test3() {
		System.out.println("Test 3");

	}

	public static void main(String[] args) {

		// Object Create Child Class Object

		Username u = new Username();
		u.test();
		u.test2();
		System.out.println(u.a);
		u.test3();
		System.out.println(u.b);

	}

}
