package array;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		
		//Duplicates of array
		
		int[]a= {300,200,200,200,100,200,300,200,400,600,800,900,800};
		
		int num=200;
		int count=0;
		
		//Nested for loop
		
		for(int values:a) {
			if (values==num) {
				count++;
			}
			
			//System.out.println("Duplicates in Array:"+count);
			//System.out.println();
		}
		
		System.out.println("Duplicates in Array:"+count);
		
		
	}

}
