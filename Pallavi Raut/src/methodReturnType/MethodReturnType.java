package methodReturnType;

public class MethodReturnType {
	
	int a=9;
	
	public void name() {
		System.out.println(a);
	}
	public void name1( int b) {
		System.out.println(a);
		
	}
	
	//With return statement and parameters
	public void name2( String c) {
		System.out.println(a);
		return ;
	}
	
	// with return type and parameters
	public int name3(int q,int w) {
		//System.out.println(q+w);
		return q+w ;
		
	}
	
	public String institute(String t) {
		return t;
		
	}
	public static char std(char y) {
		return 'S';
		
	}
	

	public static void main(String[] args) {
		MethodReturnType m=new MethodReturnType ();
		m.name();
		m.name1(20);
		m.name2("Sep Batch");
		
		
		System.out.println(m.name3(70, 90));
		System.out.println(m.institute("Raut Classes"));
		std('P');
		System.out.println(std('P'));
	}

}
