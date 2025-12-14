package oops.inheritance;

public class Testing extends Company {

	double d = 23.5;

	public void test1() {

		System.out.println("Testing is Completed");

	}

	public static void main(String[] args) {

		Testing v = new Testing();
		v.test();
		v.test1();
		System.out.println(v.s);
		System.out.println(v.d);
		System.out.println(v.c);
		System.out.println(v.a);

	}

}
