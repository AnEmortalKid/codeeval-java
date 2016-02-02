package com.anemortalkid.codeeval.java.easy.multiples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiplesMain {

	public static void main(String[] args) {
		try {
			Files.readAllLines(Paths.get(args[0])).stream()//
					.map(line -> {
						return Stream.of(line.split(",", 2)).map(Integer::parseInt).reduce((x, n) -> n
								* IntStream.rangeClosed(0, x).filter(i -> i * n >= x).findFirst().getAsInt());
					}).forEach(val -> System.out.println(val.get()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
