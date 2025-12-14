package polymorphism;

public class OverLoading {

	public void address(float f) {
		System.out.println("Address of Datatype float ");

	}

	public void address(String s) {
		System.out.println("Address of Datatype String ");

	}

	public void address(int a) {
		System.out.println("Address of Datatype int ");

	}

	public void address(char c) {
		System.out.println("Address of Datatype char ");

	}

	public static void main(String[] args) {

		OverLoading d = new OverLoading();
		d.address(67.7f);
		d.address("Pallavi Raut");
		d.address(500);
		d.address('R');

	}

}
