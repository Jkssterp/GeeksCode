package com.dev.jkstuff.feedly.interview.finance;

/**
 * What if Public is Removed over Class ? 				-- JVM Defaults it to public
 * What if Public is Removed over Main Method ?			-- Error: Main method not found in class TestPublic, please define the main method as: public static void main(String[] args)
 * 
 *  	-- 
 * 

 * (What if Class is Public -> ClassName is Different from FileName then ?) OR (What if i gave my FileName and ClassName Different and define class as public)
   TestPublicInMain.java:13: error: class TestPublic is public, should be declared in a file named TestPublic.java
	public class TestPublic {
       		^
		1 error
 *  
 * @author jayakrishna_gujju
 *
 */

public class TestPublicInMain {

	public static void main(String[] args) {
		System.out.println("Hello");
	}

}
