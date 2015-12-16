package com.dev.jkstuff.feedly.interview.techgig.digitalCodeClash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 
 * A community hall owner gives it on rent for family functions and parties. He
 * charges Rs.1 thousand for a booking no matter how long is the booking.For
 * each day, he receives some requests to book the community hall which consists
 * of the starting hour and ending hour of the booking. Owner can’t take two
 * bookings which overlap but can take two bookings which are back to back (i.e.
 * ending time of one Skill bookingCmmunityis the starting time of the other).
 * For simplicity, we’ll assume that the time format is 24 hour. Given all the
 * requests for a day, you have to find out the maximum profit that the owner
 * can make on that day.
 * 
 * Input/Output Specifications
 * 
 * Input:
 * 
 * Input1: An array of strings containing requests {list of integer pairs(x#y):
 * x is the starting time and y is the starting time of the booking and 1<= x.
 * 
 * Input2: Total Number requests in the input array.
 * 
 * For Example: {1#3,4#5,7#12,20#23,23#24}
 * 
 * Output: Maximum profit in thousands (Integer)
 * 
 * Examples: 
 * 
 * Example 1-
 *		Input 1: {1#3,4#5,7#12,20#23,23#24}; 
 * 		Input 2: 5 ; 
 * 		Output : 5;
 * 
 * Example 2- 
 * 		Input 1: {1#3} ; 
 * 		Input 2: 1 ;
 * 		Output : 1 ;
 * 
 * @author jayakrishna_gujju
 *
 */
public class CandidateCode {
	
	public static int profit_value(String[] input1, int input2){
		fetchStartingAndEnding(input1);
		return 1;
	}
	
	public static Map<Integer, Map<Integer, Integer>> fetchStartingAndEnding(String[] input1){
		 // Read starting, ending and no.of hours 
        Map<Integer, Map<Integer, Integer>> pairs = new HashMap<Integer, Map<Integer, Integer>>();
        Map<Integer,Integer> hours = new HashMap<Integer, Integer>();
        
		for(String s : input1){
			final StringTokenizer tokenizer = new StringTokenizer(s, "#");
			// Split Key and Value tokens
			Integer key = Integer.parseInt(tokenizer.nextToken());
			Integer value = Integer.parseInt(tokenizer.nextToken());
			Integer hour = value - key;
			hours.put(value,hour);
			pairs.put(key, hours);
		}
		return pairs;
	}

	
	public static void main(String[] args) {
		String[] params = {"1#2","2#3","3#4","4#5"};
		System.out.println(fetchStartingAndEnding(params));
	}
}
