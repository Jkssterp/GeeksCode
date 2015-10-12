package com.prolifics.adm.jkstuff.feedly.interview;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibonacci(10);
		fibonaciSeries(10);
	}

	public static void fibonaciSeries(int number) {
		System.out.printf("\nFibonacci series in Java of number %s using recursion %n",number);
		for (int i = 1; i <= number; i++) {
			System.out.printf("%s ", getFibonacci(i));
		}
	}

	public static int getFibonacci(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}

	public static void fibonacci(int number) {
		int fibo1 = 1;
		int fibo2 = 1;

		System.out.printf("%nFibonacci series of %d numbers are : ", number);
		System.out.printf("%s ", fibo1);
		System.out.printf("%s ", fibo2);

		int fibonacci ;
		for (int i = 2; i < number; i++) {
			fibonacci 	= fibo1 + fibo2;
			System.out.printf("%s ", fibonacci);
			fibo2 = fibo1;
			fibo1 = fibonacci;
		}
	}

}
