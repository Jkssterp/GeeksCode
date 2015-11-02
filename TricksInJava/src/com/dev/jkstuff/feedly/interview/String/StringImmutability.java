package com.dev.jkstuff.feedly.interview.String;

public class StringImmutability {
 
	public static void main(String [] args)
	{
		String s1 = new String("Ramnadh");
		String s2 = new String("Sanjuu");
		s1.concat(s2);
		System.out.println(s1);
	}
 
}