package defaultvalue;

public class DefaultValue {

	// primitive-8//non-primitive(2)
	// Numeric(6)-integer(4)--Floating(2)--Non-Numeric--(2)
	// integer(4) BSIL

	byte b;
	short s;
	int i;
	long l;

	float f;
	double d;

	char c;
	boolean p;

	String s1;

	public static void main(String[] args) {
		DefaultValue d = new DefaultValue();

		System.out.println("The default value of byte is:" + d.b);
		System.out.println("The default value of short is:" + d.s);
		System.out.println("The default value of int is:" + d.i);
		System.out.println("The default value of long is:" + d.l);

		System.out.println("---------------------------------------");

		System.out.println("The default value of float is:" + d.f);
		System.out.println("The default value of double is:" + d.d);

		System.out.println("-----------------------------------------");

		System.out.println("The default value of char is:" + d.c);
		System.out.println("The default value of boolean is:" + d.p);

		System.out.println("--------------------------------------");

		System.out.println("The default value of string is:" + d.s1);

	}

}
