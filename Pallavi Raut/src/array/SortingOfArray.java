package array;

import java.util.Arrays;

public class SortingOfArray {

	public static void main(String[] args) {
		
		
		int[]a= {700,900,200,100,500,300};
		
		
		
		System.out.println("Before sorting:"+Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting:"+Arrays.toString(a));
		
		
		System.out.println("------------------------------------");
		
		float[]f= {34.5f,67.5f,78.4f,23.7f};
		
		System.out.println("Before sorting:"+Arrays.toString(f));
		
		Arrays.sort(f);
		
		System.out.println("After sorting:"+Arrays.toString(f));
		
		
		System.out.println("--------------------------------------");
		
		char[] c= {'T','R','Y','E','D'};
		
		System.out.println("Before sorting:"+Arrays.toString(c));
		
		Arrays.sort(c);
		
		System.out.println("After sorting:"+Arrays.toString(c));
		
		
	}

}
