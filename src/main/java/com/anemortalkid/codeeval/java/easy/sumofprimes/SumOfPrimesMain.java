package com.anemortalkid.codeeval.java.easy.sumofprimes;

import java.util.stream.LongStream;

public class SumOfPrimesMain {

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

	public static void main(String[] args) {
		System.out.println(LongStream.of(getNPrimes(1000)).sum());
	}

}
