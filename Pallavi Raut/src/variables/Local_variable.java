package variables;

public class Local_variable {

	// local variable: inside the class and inside the method
	public void employee() {
		double d = 90.67;
		char c = 'S';
		System.out.println(d);
		System.out.println(c);

	}

	public static void student() {
		short s = 35;
		System.out.println(s);
	}

	public static void main(String[] args) {
		Local_variable n = new Local_variable();

		n.employee();

		Local_variable.student();

	}

}
