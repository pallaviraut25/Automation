package interface1;

public class NormalClass implements A, B,C {

	public static void main(String[] args) {
		NormalClass t = new NormalClass();
		t.add();
		t.sub();
		System.out.println(t.a);
		System.out.println(t.s);
		System.out.println(t.d);
		System.out.println(t.c);
		

		// Other Way to access Static Method

		A.mult();
		C.address();

	}

	@Override
	public void add() {
		System.out.println("Add");
	}

	@Override
	public void sub() {
		System.out.println("Sub");

	}

}
