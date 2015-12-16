package com.dev.jkstuff.feedly.interview.String;

public class PalindromeString {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("DADy");
		System.out.println(s+" is Palindrome : "+isPalindromeString(s));
	}

	private static boolean isPalindromeString(StringBuilder s) {
		int n = s.length();
		for (int i = 0; i < (n / 2) + 1; ++i) {
			if (s.charAt(i) != s.charAt(n - i - 1))
				return false;
		}
		return true;
	}

}
