package collection;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {

		HashMap<Integer, String> Salary_name = new HashMap<Integer, String>();

		Salary_name.put(null, null);
		Salary_name.put(1, "Pallavi");
		Salary_name.put(2, "Pratiksha");
		Salary_name.put(3, "Deoyani");
		Salary_name.put(4, "Khushi");
		Salary_name.put(5, "Trupti");
		Salary_name.put(6, "Pallu");
		Salary_name.put(7, "Pallavi");
		Salary_name.put(null, "Rani");
		Salary_name.put(8, null);
		Salary_name.put(4, "Tanvi");
		Salary_name.put(null, "Kritika");

		System.out.println(Salary_name);
		System.out.println(Salary_name.containsKey(6));
		System.out.println(Salary_name.containsValue("Pallavi"));
		System.out.println(Salary_name.clone());
		System.out.println(Salary_name.get(2));
		System.out.println(Salary_name.getOrDefault(6, "Pallu"));
		System.out.println(Salary_name.isEmpty());
		System.out.println(Salary_name.size());
		System.out.println(Salary_name.entrySet());

		Salary_name.remove(4);
		System.out.println(Salary_name);

		Salary_name.remove(7, "Pallavi");
		System.out.println(Salary_name);

		System.out.println(Salary_name.values());

		System.out.println(Salary_name.keySet());

		Salary_name.replace(6, "Deepali");
		System.out.println(Salary_name);

		Salary_name.replace(1, "Pallavi", "Harshada");
		System.out.println(Salary_name);
		
	}

}
