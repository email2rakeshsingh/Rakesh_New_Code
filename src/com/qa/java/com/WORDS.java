package com.qa.java.com;

public class WORDS {
	public static void main(String[] args) {
		String string = "Java is a programming language. Java is widely used in software Testing";

		// Convert the string to lowercase and split using a regex to account for
		// punctuation
		String[] words = string.toLowerCase().split("[\\s,.]+"); // Splits by space, comma, or period

		String word = "java"; // The word to search
		int occurrences = 0;

		// For each word in the array, check if it matches the target word
		for (String w : words) {
			if (w.equals(word)) {
				occurrences++;
			}
		}

		System.out.println("Occurrences of the word 'Java': " + occurrences);
	}
}
