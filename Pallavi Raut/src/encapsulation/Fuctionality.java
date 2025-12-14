package encapsulation;

public class Fuctionality {
	
	
	private int pin_code=4567;
	
	private void pass(int a) {
		pin_code=a;
		System.out.println(pin_code);
		
		
	}

	public static void main(String[] args) {
		Fuctionality s=new Fuctionality ();
		s.pass(5678);
		
		
	}

}
