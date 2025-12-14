package constructor;

public class ParameterizedConstructor {

	// parameterized constructor

	public ParameterizedConstructor(int a, float b, char c, String s) {

		System.out.println("ParameterizedConstructor");
		System.out.println("Value of a is:" + a);
		System.out.println("Value of b is:" + b);
		System.out.println("Value of c is:" + c);
		System.out.println("Value of s is:" + s);
	}

	// Instance Method

	public void username() {
		System.out.println("Pallavi");

	}

	// Static Method

	public static void name() {
		System.out.println("Pallavi Raut");

	}

	public static void main(String[] args) {

		ParameterizedConstructor p = new ParameterizedConstructor(45, 45.77f, 'P', "Pallavi");
		p.username();
		name();
	}

}
