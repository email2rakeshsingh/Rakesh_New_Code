package com.qa.java.com;

public class Numberofoccurrence {
	/*
	 * 7. Counting number of occurrences of given word in a string using Java?
	 * String =
	 * "Java is a programming language. Java is widely used in software Testing";
	 * Input = ”Java”, Output = 2
	 * 
	 */

	public static void main(String[] args) {

		String str = "Java is a programming language. Java is widely used in software Testing";
		String word = "java";
		int occrance = 0;

		String[] words = str.toLowerCase().split(" ");

		for (int i = 0; i < words.length; i++) {

			if (words[i].equals(word)) {
				occrance++;

			}

		}
		System.out.println(occrance);
	}

}
