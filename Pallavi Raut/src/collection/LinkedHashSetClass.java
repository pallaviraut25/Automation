package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {

		LinkedHashSet<String> Name = new LinkedHashSet<String>();

		Name.add("Pallavi");
		Name.add("Ashwini");
		Name.add("kaveri");
		Name.add("Pallavi");
		Name.add("Rani");
		Name.add("Mishti");
		Name.add("Triveni");
		Name.add("Anuradha");
		Name.add(null);
		
		System.out.println(Name);
		
		System.out.println(Name.clone());
		System.out.println(Name.isEmpty());
		System.out.println(Name.contains("Triveni"));
		System.out.println(Name.getFirst());
		System.out.println(Name.getLast());
		System.out.println(Name.getClass());
		

		Name.clear();
		System.out.println(Name);
	}

}
