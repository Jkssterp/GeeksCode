package com.dev.jkstuff.learnings;

import static java.lang.Character.getNumericValue;

public class TechGigExams {

	public static void main(String[] args) {
		closingBrackets();
		selfAware();
		stringTricks();
		byteRangeTest();
		charArthemetic();
	}

	
	/**
	 * Prints out “true” for the first comparison and “false” for the next. This
	 * wouldn’t work for ints, but since Integers are separate objects it makes
	 * sense that c and d are not the same one. But why a == b?
	 * 
	 * The Integer type keeps a cache of all objects with a value in the range
	 * of -128 to 127 for performance reasons. So when you declare new variables
	 * in that range, you’re actually referring to the same object.
	 * 
	 */
	private static void byteRangeTest() {
		Integer a = 42;
		Integer b = 42;
		System.out.println(a == b);
		Integer c = 666; // -127 to 127 is the int Byte Range
		Integer d = 666;
		System.out.println(c == d);
	}

	/**
	 * 
	 * 	ASCII for ‘0’ is 48
	 *	48 x 1.1 is 52.8 which turns to 52 when cast to char
	 *	52 represents ‘4’ in ASCII
	 *
	 */
	private static void charArthemetic() {
		char ch = '0';
		ch *= 1.1;
		System.out.println(ch);
	}
	


	private static void stringTricks() {
		String _‎ = "Hello ";
		String _‏ = "World";
		String _‎‏ = " !!";
		System.out.println(_‎ + _‏ + _‎‏);
	}

	/**
	 * What is the smallest value which prints WTF? The type of x is up to you.
	 */
	private static void selfAware() {
		Double x = Double.MIN_VALUE;
		if (x != (x += 0.0f))
			System.out.println("WTF");
	}

	/**
	 * First, some background. There is a character encoded with \u202e which is
	 * used for Right to Left languages like Hebrew or Arabic, and makes the
	 * rest of the line appear in reverse order. It’s a zero width character,
	 * and not only that, it’s also valid to use as a Java identifier. Try
	 * copying the code snippet, move around your cursor and then you’ll notice
	 * where it appears in the code.
	 * 
	 * Other than RTL language support, it’s also very useful if you want to
	 * pull a prank on someone. Replace a closing bracket with an opening
	 * bracket that has this character behind it to reverse the rest of the line
	 * – And see what happens next. If you decide to do that, please send us a
	 * photo of the victim’s face :)
	 * 
	 */
	private static void closingBrackets() {
		for (char c‮ = 1; c‮ > 0; c‮++)
			if (getNumericValue(c‮) > 50)
				System.out.println(c‮ + ": " + getNumericValue(c‮));
	}
}
