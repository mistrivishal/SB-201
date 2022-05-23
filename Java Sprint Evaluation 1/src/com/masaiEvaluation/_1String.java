package com.masaiEvaluation;

public class _1String {
	
	public static void main(String[] args) {
//		Strings are immutable because of the security perpose if any one want to exetend or to modification in the string
		
//		String And StringBuilder;
//		AS strings are immutable and not allowed to create any modification;
//		where as StringBuilder is used where string has to be modified as per program requirement;
//		ex.
		
//		String s1 = "Hello World";
		
//		System.out.println(s1.append()); //it will throw error because string is immutable;
		
		
		StringBuilder s2 = new StringBuilder();
		s2.append("hello");
		System.out.println(s2);
		s2.append(" World");
		System.out.println(s2);
		
		
		
		
//		5 Methods of String Class:
		String sample = "Welcome to java";
		
//		1.toUpperCase;
//		it will convert all the character to upper case
		System.out.println(sample.toUpperCase());
		
//		2.toLowerCase;
//		it will convert all the character to lower case;
		System.out.println(sample.toLowerCase());
		
//		3.length();
//		it will return the length of the string in form of integer;
		System.out.println(sample.length());
		
//		4.charAt();
//		it will return the character of string at particular index;
		System.out.println(sample.charAt(0));
		
//		5.concat();
//		it will add the string at the end of the existing string and return the complete new string
		String newsample = sample.concat(" batch JA111");
		System.out.println(newsample);
	}
	
	
}
