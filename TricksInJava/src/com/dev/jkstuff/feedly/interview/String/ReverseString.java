package com.dev.jkstuff.feedly.interview.String;

public class ReverseString {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("MAD");
		reverse(s);
	}

	private static void reverse(StringBuilder s) {
		for(int i=s.length()-1;i>=0;i--){
			System.out.println(s.charAt(i));
		}
	}
}
