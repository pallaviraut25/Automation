package abstraction;

public class NormalClass extends Calculation {

	public static void main(String[] args) {
		
		NormalClass k=new NormalClass();
		k.add();
		k.sub();
		k.mult();
		k.div();

	}

	@Override
	public void add() {
		System.out.println("Addition");

	}

	@Override
	public void sub() {
		System.out.println("Substraction");

	}

	@Override
	public void mult() {
		System.out.println("Multiplication");

	}

	@Override
	public void div() {
		System.out.println("Division");
	}

}
