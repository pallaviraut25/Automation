package thisKeyword;

public class ThisKeywordInBothConstructor {

	public ThisKeywordInBothConstructor() {

		this(45.5);

		System.out.println("User defined Constructor");
	}

	public ThisKeywordInBothConstructor(int a) {
		this("Pallavi");

		System.out.println("Parameterized Constructor int");
	}

	public ThisKeywordInBothConstructor(double d) {
		this('S');

		System.out.println("Parameterized Constructor double");
	}

	public ThisKeywordInBothConstructor(float f) {
		this(45);

		System.out.println("Parameterized Constructor float");
	}

	public ThisKeywordInBothConstructor(char c) {
		this(45.5f);

		System.out.println("Parameterized Constructor char");
	}

	public ThisKeywordInBothConstructor(String s) {
		//First Execute--where there will be not be :this keyword

		System.out.println("Parameterized Constructor String");
	}

	public static void main(String[] args) {

		ThisKeywordInBothConstructor n = new ThisKeywordInBothConstructor();

	}

}
