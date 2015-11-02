package com.dev.jkstuff.jvm;

public class Addition {

	public static void main(String[] args) {
		System.out.println("Addition of Two Numbers:"+add(5,5));
	}
	
	private static int add(int a, int b) {
		int c = 10;
		c = a+ b;
		return c;
	}
}
