package array;

public class ArrayInteger {

	public static void main(String[] args) {

		// integer

		int[] a = new int[5];
		
		//Memory Allocation: int 4 byte*5=20
		//long 8 byte 8*5=40

		// Array index start from zero

		a[0] = 80;
		a[1] = 40;
		a[2] = 50;
		a[3] = 60;
		a[4] = 70;
		// a[5]=600;

		// for each loop/ enhance loop
		// ArrayIndexOutOfBoundsException

		for (int i : a) {
			System.out.println(i);
		}

		System.out.println("length of the array is as:" + a.length);
		System.out.println("Value of index 3 is:" + a[3]);

		System.out.println("-------------------------------");

		int[] b = new int[6];

		// Array index start from zero

		b[0] = 800;
		b[1] = 400;
		b[2] = 500;
		b[3] = 600;
		b[4] = 700;
		b[5] = 600;

		// for each loop/ enhance loop
		

		for (int i : b) {
			System.out.println(i);
		}

		System.out.println("length of the array is as:" + b.length);
		System.out.println("Value of index 5 is:" + b[5]);
		
		System.out.println("---------------------------------");
		
		//long
		
		long[] c=new long[10];
		
		c[0]=780;
		c[1]=670;
		c[2]=450;
		c[3]=340;
		c[4]=349;
		c[5]=769;
		c[6]=987;
		c[7]=767;
		c[8]=798;
		c[9]=784;
		
		for (long t:c) {
			System.out.println(t);
		}
			
			System.out.println("Length of the array is as:"+c.length);
			System.out.println("Value of Index 8 is:"+c[8]);
			
			
			System.out.println("--------------------------------");
			
			//Floating
			
			float[]x=new float[3];
			
			x[0]=45.78f;
			x[1]=67.78f;
			x[2]=56.78f;
			
			for(float f:x) {
				System.out.println(f);
			}
		
		System.out.println("Lenght of the array is as:"+x.length);
		System.out.println("Value off the Index 1 is:"+x[1]);
		
		System.out.println("----------------------------------");
		
		
		//For Loop
		
		//for (int j=0;j<a.length;j++) {
			for (int j=0;j<=a.length-1;j++) {
				
			System.out.println(a[j]);
		}
		
	}
	

}
