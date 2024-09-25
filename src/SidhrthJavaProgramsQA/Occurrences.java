package SidhrthJavaProgramsQA;

import java.security.PublicKey;

import StringQuestions.interviewsONLINE;

public class Occurrences {
	/*
	 * 7. Counting number of occurrences of given word in a string using Java?
	 * String =
	 * "Java is a programming language. Java is widely used in software Testing";
	 * Input = ”Java”, Output = 2
	 */

	public static void main(String[] args) {

		String str = "Java is a programming is language. I love is Java!";
		String[] words = str.toLowerCase().split("\\W+"); // Split by non-word characters

		String word = "is";
		int occurrences = 0;

		for (int i = 0; i < words.length; i++) {
		    if (words[i].equals(word)) {
		        occurrences++;
		    }
		}

		System.out.println("Occurrences of the word '" + word + "': " + occurrences);


	}

}
