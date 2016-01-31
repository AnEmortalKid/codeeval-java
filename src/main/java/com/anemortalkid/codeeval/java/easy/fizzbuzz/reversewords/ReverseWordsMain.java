package com.anemortalkid.codeeval.java.easy.fizzbuzz.reversewords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReverseWordsMain {
	public static void main(String[] args) {
		try {
			Files.readAllLines(Paths.get(args[0])).stream()
					.map(x -> Stream.of(x.split(" ")).reduce((a, b) -> b + " " + a).orElse(""))
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
