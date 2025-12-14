package wrapperClass;

public class PrimitiveToWrapper {

	public static void main(String[] args) {

		int a = 80;
		char b = 'R';
		float f = 34.5f;
		boolean k = true;
		Integer s = Integer.valueOf(a);
		System.out.println(s);

		Character c = Character.valueOf(b);
		System.out.println(c);

		Float d = Float.valueOf(f);
		System.out.println(d);

		Boolean t = Boolean.valueOf(k);
		System.out.println(t);
	}

}
