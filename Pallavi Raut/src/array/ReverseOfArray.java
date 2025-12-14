package array;

import java.util.Arrays;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		
		int[]a= {200,300,500,700,450};
		
		for (int i=a.length-1;i>=0;i--){
			
			System.out.println(a[i]+" ");
			
		}
		
		
		
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		
		System.out.println("--------------------------------------------");
		
		char[]c= {'R','F','U','D','O'};
		
		for (int j=c.length-1;j>=0;j--) {
			
			System.out.print(c[j]+" ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		float[]f= {45.3f,67.8f,23.6f,88.5f,45.3f};
		
		for(int t=f.length-1;t>=0;t--) {
			
			System.out.print(f[t]+" ");
		}
		
		System.out.println();
		System.out.println("------------------------------------------------");
		
		String[]s= {"Pallavi","Madhuri","Tanvi","Pappa","Vaishu"};
		
		for(int d=s.length-1;d>=0;d--) {
			
			System.out.println(s[d]);
		}
	}

}
