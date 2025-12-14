package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {

		HashSet<Integer> emp_id = new HashSet<Integer>();

		// emp_id.add(400);

		// For Loop

		for (int a = 1; a <= 50; a++) {
			emp_id.add(a);

		}
		System.out.println(emp_id);
		System.out.println(emp_id.clone());
		System.out.println(emp_id.isEmpty());
		System.out.println(emp_id.contains(45));
		// System.out.println(emp_id.clear());

		System.out.println("---------------------------------------");

		HashSet<String> City = new HashSet<String>();

		/*
		 * City.add("Wardha"); City.add("Hinganghat"); City.add("Nagpur");
		 * City.add("Buttibori"); City.add("Shegaon"); City.add("Wardha");
		 * City.add(null);
		 * 
		 * System.out.println(City); System.out.println(City.clone());
		 * System.out.println(City.contains("Hinganghat"));
		 * System.out.println(City.isEmpty()); System.out.println(City.getClass());
		 * System.out.println(City.removeAll(City));
		 * 
		 * City.remove("Wardha"); System.out.println(City);
		 */

		City.add("Radha");
		City.add("Kalyani");
		City.add("Vaishnavi");
		City.add("Utkarsha");

		// iterator

		Iterator<String> a = City.iterator();
		while (a.hasNext()) {
			System.out.println(a.next());
		}
	}
}
