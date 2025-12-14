package array;

public class ObjectClassHeterogeneousData {

	public static void main(String[] args) {

		Object[] j = { 200, 78.8f, 'G', "Pallavi Raut", 56.8, "Nagpur" };

		// Nested for loop

		for (Object i : j) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------");
		
		Object[] a= {900,56.7,34.7f,'Y',"Wardha"};
		
		for(Object t:a) {
			System.out.println(t);
		}
	}

}
