package variables;

public class Instance_Variables {

	int a = 90;

	public void login() {
		System.out.println(a);

	}

	public static void username() {
		Instance_Variables t = new Instance_Variables();

		System.out.println(t.a);

	}

	public static void main(String[] args) {
		Instance_Variables t = new Instance_Variables();
		t.login();

		Instance_Variables.username();

	}
}
