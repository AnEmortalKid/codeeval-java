package com.anemortalkid.codeeval.java.easy.utils;

import java.util.stream.IntStream;

/**
 * Location of handy functions that I have to re copy paste into the codeeval
 * based on each problem
 * 
 */
public final class HandyUtils {

	/**
	 * @param array
	 *            the initial array, ie {0,1,2,3}
	 * @return a reversed array, ie {3,2,1,0}
	 */
	public static int[] reverseArray(int[] array) {
		int[] reversed = new int[array.length];
		for (int i = array.length - 1; i > -1; i--) {
			reversed[array.length - 1 - i] = array[i];
		}
		return reversed;
	}

	/**
	 * @param n
	 *            number to reverse (ie 123)
	 * @return that number reversed (ie 321)
	 */
	public static int reverse(int n) {
		int reversed = 0;
		int input = n;
		while (input != 0) {
			reversed = reversed * 10 + input % 10;
			input = input / 10;
		}
		return reversed;
	}

	/**
	 * @param n
	 *            the number to check for primeness
	 * @return <code>true</code> if the number is prime, <code>false</code>
	 *         otherwise
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i < n + 1; i++) {
			if (n % i == 0 && i != n)
				return false;
		}
		return true;
	}

	/**
	 * 
	 * @param max
	 *            the maximum number to compute primes up to
	 * @return an array of primes from 2 to max
	 */
	public static int[] getPrimes(int max) {
		return IntStream.rangeClosed(2, max).filter(i -> isPrime(i)).toArray();
	}

}
