package samplePgms;

public class StringMethodsPgm {

	public static void main(String[] args) {
		// length()
		String s = "java";
		System.out.println(s.length());
		
		//equals()
		String s1 = "java";
		String s2 = "Java";
		String s3 = "java";
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s3)); // true
		// equalsIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s1.equalsIgnoreCase(s3)); // true
		
		//toUpperCase():
		System.out.println(s.toUpperCase());
		//to Lowercase
		System.out.println(s2.toLowerCase());
		//startswith()
		System.out.println(s.startsWith("ja"));
		
		// endswith
		System.out.println(s.endsWith("a"));
		// char At()
		System.out.println(s.charAt(2));
		// value of
		int x = 100;
		System.out.println(String.valueOf(x));
		
	}

}
