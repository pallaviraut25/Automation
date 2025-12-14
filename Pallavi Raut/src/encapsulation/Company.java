package encapsulation;

public class Company {
	
	private String s="Pallavi Raut Private Ltd";
	
private	char c='T';
	
	private void name(String t) {
		s=t;
		System.out.println(s);
		
	}
	
	private void address(char j) {
		c=j;
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
		
		Company k=new Company();
		k.name("Mishti");
		k.address('P');
	}

}
