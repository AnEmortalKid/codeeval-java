package com.anemortalkid.codeeval.java.easy.fizzbuzz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Codeeval-easy-fizzbuzz challenge
 *
 */
public class FizzBuzzMain {

	public static void main(String[] args) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(args[0]));
		lines.stream().forEach(s -> {
			String[] vals = s.split(" ");
			int x = Integer.parseInt(vals[0]);
			int y = Integer.parseInt(vals[1]);
			int n = Integer.parseInt(vals[2]);
			for (int i = 1; i <= n; i++) {
				if (i % x == 0) {
					System.out.print("F");
				}
				if (i % y == 0) {
					System.out.print("B");
				}
				if (i % x != 0 && i % y != 0) {
					System.out.print(i);
				}
				if (i != n) {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		});
	}
}
