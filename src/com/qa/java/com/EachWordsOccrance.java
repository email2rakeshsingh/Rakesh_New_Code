package com.qa.java.com;

import java.util.HashMap;
import java.util.Map;

public class EachWordsOccrance {

	/*
	 * 8. Find each word occurrence from given string in string java Input =
	 * "Alice is girl and Bob is boy"; Output = {Bob=1, Alice=1, and=1, is=2,
	 * girl=1, boy=1}
	 */

	public static void main(String[] args) {

		String str = "Alice is girl and Bob is boy";

		Map<String, Integer> hasMap = new HashMap<>();
		String[] words = str.toLowerCase().split(" ");

		for (String word : words) {
			if (hasMap.containsKey(word)) {

				hasMap.put(word, hasMap.get(word) + 1);
			} else {
				hasMap.put(word, 1);

			}

		}
		System.out.println(hasMap);

	}

}
