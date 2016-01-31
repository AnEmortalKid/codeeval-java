package com.anemortalkid.codeeval.java.easy.primepalindrome;

import java.util.stream.IntStream;

/**
 * Prints highest palindrome prime < 1000. <br/>
 * The code-eval challenge tells you to print 929, so if you want to get the
 * points ezpz, just print "929"
 *
 */
public class PrimePalindromeMain {

	private static int[] getPrimes(int max) {
		return IntStream.rangeClosed(2, max).filter(i -> isPrime(i)).toArray();
	}

	private static int[] reverseArray(int[] array) {
		int[] reversed = new int[array.length];
		for (int i = array.length - 1; i > -1; i--) {
			reversed[array.length - 1 - i] = array[i];
		}
		return reversed;
	}

	private static int reverse(int n) {
		int reversed = 0;
		int input = n;
		while (input != 0) {
			reversed = reversed * 10 + input % 10;
			input = input / 10;
		}
		return reversed;
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	private static int highestPalindrome() {
		int[] primes = reverseArray(getPrimes(1000));
		return IntStream.of(primes).filter(x -> x == reverse(x)).findFirst().orElse(2);
	}

	public static void main(String[] args) {
		System.out.println(highestPalindrome());
	}

}
