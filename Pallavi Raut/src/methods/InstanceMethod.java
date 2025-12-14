package methods;

public class InstanceMethod {

	public void testing() {
		int a = 45;
		System.out.println(a);

	}

	public void STP() {
		char c = 'T';
		System.out.println(c);
	}

	public void Pallavi() {
		String s = "Pallavi";
		System.out.println(s);
	}

	public static void main(String[] args) {

		InstanceMethod i = new InstanceMethod();

		i.testing();
		i.STP();
		i.Pallavi();

	}

}
