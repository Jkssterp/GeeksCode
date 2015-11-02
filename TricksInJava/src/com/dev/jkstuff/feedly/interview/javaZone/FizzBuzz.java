package com.dev.jkstuff.feedly.interview.javaZone;

/**
 * 
 * I imagine you've heard of the Fizz Buzz interview question, it's not a
 * difficult problem but today we're going to put a slightly different take on
 * it. It originates from a children's game played in UK schools.
 * 
 * These children count aloud and for every number divisible by 3 they say
 * "Fizz" and for every number divisible by 5 they say "Buzz" and when divisible
 * by both they say "Fizz-Buzz".
 * 
 * Here are the requirements:
 * 
 * The program must count from 1 to 100 and output the number unless divisible
 * by 3 or 5.
 * 
 * If the number is divisible by 3 the program should output the word "Fizz"
 * 
 * If the number is divisible by 5 it should output the word "Buzz"
 * 
 * When divisible by both 3 and 5 the program should output "Fizz-Buzz"
 * 
 * All very simple, but now the challenge is writing the shortest program
 * possible, after all this is golf and there are no handicaps.
 * 
 * The rules are simple, the program should resolve the above problem in any
 * language in the least characters possible.
 * 
 * In next week's edition of code challenges we will announce the winner of this
 * week's challenge.
 * 
 * @author jayakrishna_gujju
 *
 */
public class FizzBuzz {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				fizz_buzz(i);
				continue;
			}
			if (i % 3 == 0) {
				fizz(i);
				continue;
			}
			if (i % 5 == 0) {
				buzz(i);
				continue;
			}
			System.out.print(" " + i);
		}

	}

	private static void buzz(int i) {
		System.out.print(" Buzz");
	}

	private static void fizz(int i) {
		System.out.print(" Fizz");
	}

	private static void fizz_buzz(int i) {
		System.out.print(" Fizz-Buzz");
	}

}
