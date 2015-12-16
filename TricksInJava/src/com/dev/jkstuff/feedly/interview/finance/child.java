package com.dev.jkstuff.feedly.interview.finance;

public class child extends TestAbstractConstructorInstance{

	public static void main(String[] args) {
		System.out.println("Child Main");
		child c = new child();
		System.out.println(c.flag);
		System.out.println(c.name);
	}
	
	public child() {
		super();
	}	
	
}