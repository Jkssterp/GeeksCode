package com.prolifics.adm.jkstuff.feedly.interview;

import java.util.Scanner;

/**
 * To find the Square Root of some 'x' value.
 * 
 * Let 's' be the answer then we know that <code> 0<=s<=x </code>
 * 
 * Consider any Random Number 'r'.
 * <p>
 * <code> If r*r &lt;= x then s&gt;r;  else r*r &gt; x then s&lt;r; </code>
 * </p>
 * 
 * @author jayakrishna_gujju
 *
 */
public class SquareRoot {

	public static void main(String[] args) {

		System.out.println(squareRoot(11));
		System.out.println(squareRoot(49));
		/*
		 * int value; int sqrtValue;
		 * 
		 * @SuppressWarnings("resource") Scanner scanner = new
		 * Scanner(System.in);
		 * 
		 * System.out.println("Enter the Input Value :"); value =
		 * (scanner.nextInt());
		 * 
		 * double rootValue = Math.sqrt(value);
		 * 
		 * if (value % 2 == 0) sqrtValue = (int) rootValue; else sqrtValue =
		 * (int) Math.floor(rootValue);
		 * 
		 * System.out.println("Square Root of " + value + " is : " + sqrtValue);
		 */

	}

	private static float squareRoot(float n) {
		/*
		 * We are using n itself as initial approximation This can definitely be
		 * improved
		 */
		float x = n;
		float y = 1;
		float e = (float) 0.000001; /* e decides the accuracy level */
		while (x - y > e) {
			x = (x + y) / 2;
			y = n / x;
		}
		return x;
	}

	/**
	 * Returns the square root of n. Note that the function will not work for
	 * numbers which are not perfect squares
	 */
	private static int squareRoot(int n) {
		int x = n;
		int y = 1;
		while (x > y) {
			x = (x + y) / 2;
			y = n / x;
		}
		return x;
	}
}
