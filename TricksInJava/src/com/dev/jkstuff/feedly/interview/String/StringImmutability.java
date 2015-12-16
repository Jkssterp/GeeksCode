package com.dev.jkstuff.feedly.interview.String;

public class StringImmutability {
 
	public static void main(String [] args)
	{
		// String Objects
		String s1 = new String("Ramnadh");
		String s2 = new String("Ramnadh");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("String Immutable");
		
		// Why Immutable ?
		s1.concat(s2);
		System.out.println(s1);
		
		System.out.println("String Literals");

		// String Literals
		String s3  = "jitesh";
		String s4  = "jitesh";
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println("String Constant Pool");
		
		// String Constant Pool
		String s5 = new String("Sanjuu");
		String s6 = new String("Sanjuu");
		
		String s7  = "jk";
		String s8  = "jk";
		
	}
 
}