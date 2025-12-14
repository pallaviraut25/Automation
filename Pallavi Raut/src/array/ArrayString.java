package array;

public class ArrayString {

	public static void main(String[] args) {

		// String

		String[] a = new String[3];

		a[0] = "Pallavi";
		a[1] = "Vaishnavi";
		a[2] = "Tanvi";

		for (String i : a) {
			System.out.println(i);
		}

		System.out.println("The lenght of the array is as:" + a.length);
		System.out.println("The value of index 2 is:" + a[2]);

		System.out.println("---------------------------------");

		String[] emp_name = new String[5];

		emp_name[0] = "Pallavi";
		emp_name[1] = "Vaishnavi";
		emp_name[2] = "Tanvi";
		emp_name[3] = "Madhuri";
		emp_name[4] = "Jayshari";

//for each loop /enhance loop

		for (String i : emp_name) {
			System.out.println(i);

		}
		System.out.println("The length of an array is as:" + emp_name.length);
		System.out.println("The value of index 3 is:" + emp_name[3]);

		System.out.println("----------------for loop---------------------------");

		for (int j = 0; j < emp_name.length; j++) {
			System.out.println(emp_name[j]);

		}

		System.out.println("The length of an array is as:" + emp_name.length);
		System.out.println("The value of index 3 is:" + emp_name[3]);

	}

}
