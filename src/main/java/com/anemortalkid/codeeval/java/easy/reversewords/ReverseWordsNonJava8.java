package com.anemortalkid.codeeval.java.easy.reversewords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringJoiner;

public class ReverseWordsNonJava8 {

	public static void main(String[] args) {
		try {
			List<String> lines = Files.readAllLines(Paths.get(args[0]));
			for (String line : lines) {
				String[] words = line.split(" ");
				StringJoiner joiner = new StringJoiner(" ");
				for (String word : words) {
					joiner.add(word);
				}
				System.out.println(joiner.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
