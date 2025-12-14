package methodargument;

public class MethodArguments {
	
	
	
	int a;
	int o;
	static byte c;
	float f;
	long l;
	static double d;
	
	public void std(int w,int m) {
		int a=w;
		int o=m;
		//method signature: std (int,int)
		
		System.out.println(a);
		System.out.println(o);
		
	}
	
	public void name( int b , float r,long g,double q) {
		a=b;
		f=r;
		l=g;
		d=q;
		
		System.out.println(d);
		
		System.out.println(l);
		
		
		System.out.println(f);
		
		System.out.println(a);
		
	}
	public static void name1( byte d) {
		c=d;
		
		System.out.println(c);
//	MethodArguments m = new MethodArguments ()	;
	//System.out.println(m.a);
		
	}

	public static void main(String[] args) {
		
		MethodArguments m = new MethodArguments ()	;
		m.std(90,30);
		m.name(5,34.5f,45,50.56);
		name1 ((byte) 10 );
		
		
		
		
		
		
		
	}

}
