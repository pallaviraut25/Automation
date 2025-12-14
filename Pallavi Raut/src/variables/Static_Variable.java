package variables;

public class Static_Variable {

//static variable--inside the class and outside the class method	

	static int a = 45;

	// instance method
	public void function() {
		System.out.println(a);

	}

	// static method
	public static void name() {
		System.out.println(a);
	}

	public static void main(String[] args) {

		Static_Variable s = new Static_Variable();
		s.function();

		Static_Variable.name();

	}

}
