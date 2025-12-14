package collection;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {

	public static void main(String[] args) {

		LinkedHashMap<String, String> Name_company = new LinkedHashMap<String, String>();

		Name_company.put(null, null);
		Name_company.put("Pallavi", "STP Institute");

		Name_company.put("Shivansh", "VT Institute ");

		Name_company.put("Harshada", "PR Institute");

		Name_company.put("Tanvi", "TR Institute");

		Name_company.put("Rani", "UY Institute");

		Name_company.put("Pallavi", "WT Institute");

		System.out.println(Name_company);

		System.out.println(Name_company.clone());
		System.out.println(Name_company.containsValue("TR Institute"));
		System.out.println(Name_company.containsKey("Rani"));
		System.out.println(Name_company.isEmpty());
		System.out.println(Name_company.replace("Rani", "UY Institute"));
		System.out.println(Name_company.reversed());

		Name_company.replace("Pallavi", "WT Institute", "STP Institute");
		System.out.println(Name_company);

		Name_company.remove("Rani");
		System.out.println(Name_company);

		Name_company.remove("Pallavi", "STP Institute");
		System.out.println(Name_company);

		Name_company.clear();
		System.out.println(Name_company);
		
		
		
		

		System.out.println(Name_company.hashCode());

		System.out.println(Name_company.keySet());

		System.out.println(Name_company.get("Harshada"));

		System.out.println(Name_company.equals(Name_company));

		// System.out.println(Name_company.reversed());

	}

}
