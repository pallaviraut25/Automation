package constructor;

public class UserDefinedContructor {

	// user defined

	public UserDefinedContructor() {

		System.out.println("UserDefinedContructor");

	}

	// instance Method

	public void username() {
		System.out.println("Instance Method");

	}

	// Static method

	public static void Login() {

		System.out.println("Static method");

	}

	public static void main(String[] args) {

		UserDefinedContructor a = new UserDefinedContructor();
		a.username();
		Login();

	}

}
