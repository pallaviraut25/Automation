package collection;

import java.util.LinkedList;

public class LinkListClass {

	public static void main(String[] args) {

		LinkedList<Character> Letters = new LinkedList<Character>();

		Letters.add(0, 'R');
		Letters.add(1, 'S');
		Letters.add(2, 'T');
		Letters.add(3, 'U');
		Letters.add(4, 'V');
		Letters.add(5, null);

		System.out.println(Letters);

		Letters.remove(null);
		System.out.println(Letters);

		System.out.println(Letters.clone());
		System.out.println(Letters.isEmpty());
		System.out.println(Letters.contains('R'));

		Letters.removeFirst();
		System.out.println(Letters);

		Letters.removeLast();
		System.out.println(Letters);

		System.out.println("----------------------------------------");

		LinkedList<String> EmployeeName = new LinkedList<String>();

		EmployeeName.add("Vinay Shrivastav");
		EmployeeName.add("Sharukh Khan");
		EmployeeName.add("Abir Rajvansh");
		EmployeeName.add("Vinod Dhanjode ");
		EmployeeName.add("kapil Jadhav");
		EmployeeName.add(null);

		System.out.println(EmployeeName);

		System.out.println(EmployeeName.clone());
		System.out.println(EmployeeName.isEmpty());
		System.out.println(EmployeeName.contains("Pallavi Raut"));

		EmployeeName.remove(null);
		System.out.println(EmployeeName);

		EmployeeName.removeFirst();
		System.out.println(EmployeeName);

		EmployeeName.removeLast();
		System.out.println(EmployeeName);
		
		/*EmployeeName.getFirst();
		System.out.println(EmployeeName);
		EmployeeName.getLast();
		System.out.println(EmployeeName);*/
		
		System.out.println(EmployeeName.getFirst());
		System.out.println(EmployeeName.getLast());
		EmployeeName.clear();
		System.out.println(EmployeeName);
		
		System.out.println(EmployeeName.equals(EmployeeName));
		
		
		//Available in Array List Only
		//System.out.println(EmployeeName.peekFirst());
		//System.out.println(EmployeeName.peekLast());
		
		//System.out.println(EmployeeName.lastIndexOf(EmployeeName));

	}

}
