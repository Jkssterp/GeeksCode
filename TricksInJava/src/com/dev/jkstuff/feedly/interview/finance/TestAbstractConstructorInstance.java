package com.dev.jkstuff.feedly.interview.finance;

public abstract class TestAbstractConstructorInstance {

	public boolean flag;
	public String name;
	
	@SuppressWarnings("unused")
	private static void method1() {
		System.out.println("Method 1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method in Abstract  ");
		/*TestAbstractConstructorInstance t = new TestAbstractConstructorInstance() {
		}; */
	}
	
	public TestAbstractConstructorInstance() {
		System.out.println("Test abstract Constructor");
	}
	
}
