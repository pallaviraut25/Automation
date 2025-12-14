package stringmethods;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="Non functional";
		
		//isEmpty
		
		System.out.println(s.isEmpty());
		
		//String s1="";
		//System.out.println("The output of s1 is as:"+s1.isEmpty());
		
		
		//length--starts from 1
		System.out.println("The output of length is as:"+s.length());
		
		String q="API";
		System.out.println(q.length());
		
		//indexOf--index starts from zero
		System.out.println("The output of index is as:"+q.indexOf("I"));
	
		//Replace--
		
		String w="Functional Test";
		System.out.println(w.replace("Test", "Testing"));
		
		//charAt()
		System.out.println(w.charAt(11));
		
		//toLowercase()
		String e="PALLAVI RAUT";
		System.out.println(e.toLowerCase());
		
		//toUpperCase()
		String r="pallavi raut";
		System.out.println(r.toUpperCase());
		
		//subString--splits the string
		
		System.out.println(r.substring(0));
		System.out.println(r.substring(8));
		System.out.println(r.substring(0,3));
		
		
	}

}
