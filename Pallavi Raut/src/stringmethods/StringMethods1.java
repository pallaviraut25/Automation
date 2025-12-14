package stringmethods;

public class StringMethods1 {

	public static void main(String[] args) {
		
		String a="Automation Testing";
		
		//concate--
		
		System.out.println(a.concat(" Scope"));
		
		//contains
		
		System.out.println(a.contains("Testing"));
		
		//equals
		String b="Automation Testing";
		System.out.println(a.equals(b));
		
		//equalsignorecase
		System.out.println(a.equalsIgnoreCase(b));
		
		//endswith
		System.out.println(b.endsWith("ing"));
	}

}
