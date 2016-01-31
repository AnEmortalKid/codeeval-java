package com.anemortalkid.codeeval.java.easy.utils;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

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
		if (n % 2 == 0 & n != 2)
			return false;

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isPrime(long l) {
		if (l % 2 == 0 && l != 2)
			return false;

		for (long i = 2; i < l / 2; i++) {
			if (l % i == 0) {
				return false;
			}
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

	/**
	 * @param n
	 *            the number of primes to return
	 * @return an array with the desired number of primes
	 */
	public static long[] getNPrimes(int n) {
		long[] primes = new long[n];
		long counter = 2;
		int index = 0;
		while (index != n) {
			if (isPrime(counter)) {
				primes[index] = counter;
				index++;
			}
			counter++;
		}
		return primes;
	}

}
