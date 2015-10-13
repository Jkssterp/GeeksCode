package com.dev.jkstuff.learnings;

import static java.lang.Character.getNumericValue;

public class CharactersTricks{
	    public static void main(String... a‮) {
	        for (char c‮ = 1; c‮ > 0; c‮++)
	            if (getNumericValue(c‮) > 50)
	                System.out.println(c‮ + ": " + getNumericValue(c‮));
	    }
}