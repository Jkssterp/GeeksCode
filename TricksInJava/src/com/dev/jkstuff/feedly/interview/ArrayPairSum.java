package com.dev.jkstuff.feedly.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayPairSum {

	public static void main(String[] args) {

		int[] a = { 2, 4, 7, 3, 5, 1, 8, 9, 5 };
		printSumPairs(a, 10);

		int[] b = { 2, 4, 7, 3, 5, 1, 8, 9, 5 };
		sumPairs(b, 10);

	}

	public static void printSumPairs(int[] input, int k) {
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {

			if (pairs.containsKey(input[i]))
				System.out.println(input[i] + ", " + pairs.get(input[i]));
			else
				pairs.put(k - input[i], input[i]);
		}

	}

	public static void sumPairs(int[] input, int k) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < input.length; i++) {

			if (set.contains(input[i]))
				System.out.println(input[i] + ", " + (k - input[i]));
			else
				set.add(k - input[i]);
		}
	}

}