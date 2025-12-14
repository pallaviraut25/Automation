package thisKeywordInheritance;

public class Username extends Login {

	// Child Class

	String s = "Automation";

	public void name1() {

		System.out.println(this.a);

		System.out.println("Enter Name From Child Class");

	}

	public Username() {

		System.out.println(this.a);
		this.name();
		System.out.println(this.s);
		this.name1();

		System.out.println("User defined Constructor from Child Class");
	}

	public static void main(String[] args) {

		Username k = new Username();

	}

}
