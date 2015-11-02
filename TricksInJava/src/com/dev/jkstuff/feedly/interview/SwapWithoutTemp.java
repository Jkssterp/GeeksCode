package com.dev.jkstuff.feedly.interview;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a = 10, b= 20;
		
		System.out.println("A before swaping: "+a +" \nB before swaping:"+b);
		a= a+b-(b=a);
		System.out.println("A after swaping: "+a +" \nB after swaping:"+b);
		b= a+b-(a=b);
		System.out.println("A swaping back: "+a +" \nB swaping back:"+b);
	}
}
