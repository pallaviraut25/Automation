package thisKeyword;

public class ThisKeywordControlShift {

	int a = 50;

	String s = "vaishuuuu";
	static char c = 'R';
	
	//static variable and method we can access but  we will get warning

	public ThisKeywordControlShift() {
		this.Login();

		System.out.println(this.a);
		System.out.println(this.s);
		System.out.println(this.c);

		System.out.println("User defined Constructor");
	}

	public void Login() {
		
		this.Password();

		System.out.println(this.a);
		System.out.println(this.s);
		System.out.println(this.c);

		System.out.println("Instance Method");

	}
	
	public static void Password() {
		
		//We can not declare this keyword
		
		System.out.println("Static Method");
		
	}

	public static void main(String[] args) {
		ThisKeywordControlShift t = new ThisKeywordControlShift();
		// t.Login();

	}

}
