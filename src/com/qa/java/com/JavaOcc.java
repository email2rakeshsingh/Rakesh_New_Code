package com.qa.java.com;

import java.util.HashMap;
import java.util.Map;

public class JavaOcc {

	public static void main(String[] args) {

		{
			String str = "Java is great. Java is powerful. Java is everywhere!";
			String occurance = "java";

			str = str.toLowerCase();
			occurance = occurance.toLowerCase();

			String[] words = str.split("\\W+");

			Map<String, Integer> wordMap = new HashMap<>();

			for (String word : words) {
				if (wordMap.containsKey(word)) {
					wordMap.put(word, wordMap.get(word) + 1);
				} else {
					wordMap.put(word, 1);
				}
			}

			System.out.println("The word '" + occurance + "' occurs " + wordMap.getOrDefault(occurance, 0) + " times.");
		}
	}
}
