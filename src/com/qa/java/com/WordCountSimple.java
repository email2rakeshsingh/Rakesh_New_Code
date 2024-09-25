package com.qa.java.com;

import java.util.HashMap;
import java.util.Map;

public class WordCountSimple {
	public static void main(String[] args) {
		String input = "Java is great. Java is powerful. Java is everywhere!";
		String wordToCount = "Java";

		String[] words = input.split("\\W+");

		Map<String, Integer> wordMap = new HashMap<>();

		for (String word : words) {
			if (wordMap.containsKey(word)) {
				wordMap.put(word, wordMap.get(word) + 1);
			} else {
				wordMap.put(word, 1);
			}
		}
		System.out.println("The word '" + wordToCount + "' occurs " + wordMap.getOrDefault(wordToCount, 0) + " times.");
	}
}
