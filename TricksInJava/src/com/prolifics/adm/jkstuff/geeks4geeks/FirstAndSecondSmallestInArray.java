package com.prolifics.adm.jkstuff.geeks4geeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FirstAndSecondSmallestInArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the no\t");

		for (int i = 0; i < 5; i++) {
			arr.add(sc.nextInt());
		}

		System.out.println("Test ");
		int x = Collections.min(arr);

		int ind = 0;

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == x) {
				ind = i;
				break;
			}
		}
		int p = arr.remove(ind);
		x = Collections.min(arr);
		System.out.println("first smallest = " + p + "\n"
				+ " second smallest = " + x);
	}
}