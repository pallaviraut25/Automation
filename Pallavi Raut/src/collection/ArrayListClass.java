package collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {

		ArrayList<Integer> Salary = new ArrayList<Integer>();

		Salary.add(20000);
		Salary.add(30000);
		Salary.add(40000);
		Salary.add(50000);
		Salary.add(60000);
		Salary.add(70000);
		Salary.add(null);

		System.out.println(Salary);

		System.out.println(Salary.clone());
		System.out.println(Salary.contains(30000));
		System.out.println(Salary.isEmpty());
		System.out.println(Salary.remove(null));

		Salary.remove(null);
		System.out.println(Salary);

		System.out.println("-------------------------------------------");

		ArrayList<String> StudentName = new ArrayList<String>();

		StudentName.add(0, "Pallavi Raut");
		StudentName.add(1, "Tanya Mittal");
		StudentName.add(2, "Farana Bhatt");
		StudentName.add(3, "Ashnoor Kaur");
		StudentName.add(4, "Malti Chahar");
		StudentName.add(5, null);

		System.out.println(StudentName);

		System.out.println(StudentName.clone());
		System.out.println(StudentName.isEmpty());
		System.out.println(StudentName.contains("Pallavi Raut"));
		// System.out.println(StudentName.remove(null));

		StudentName.remove(null);
		System.out.println(StudentName);

		System.out.println("----------------------------------------------");

		ArrayList<Character> Letters = new ArrayList<Character>();

		Letters.add('A');
		Letters.add('B');
		Letters.add('C');
		Letters.add('E');
		Letters.add('D');
		Letters.add(null);

		System.out.println(Letters);

		System.out.println(Letters.clone());
		System.out.println(Letters.contains('C'));
		System.out.println(Letters.isEmpty());
		// System.out.println(Letters.remove('B'));
		// System.out.println(Letters.contains('D'));

		Letters.remove(null);
		System.out.println(Letters);

		System.out.println(Letters.getFirst());
		System.out.println(Letters.getLast());
		
		//System.out.println(Letters.clear());

	}

}
