package withoutAllocatingMemory;

public class ArrayFloat {

	public static void main(String[] args) {
		
		
		//Without Allocating Momory
		
		float[]r= {45.6f,34.8f,23.9f,67.8f};
		
		char[]p= {'P','V','R','B'};
		
		//for each loop
		
		for(float j:r) {
			System.out.println(j);
			
		}
		
		System.out.println("----------------------------------------");
		
		for(char k:p) {
			System.out.println(k);
		}
		
		System.out.println("The length of an array is as:"+p.length);
		
		
		
	}

}
