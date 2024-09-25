package com.qa.java.com;

import java.util.HashMap;
import java.util.Map;

public class occ {
	public static void main(String[] args) {
		String str = "Alice is girl and Bob is boy";
		Map<String, Integer> hasMap = new HashMap<>();
		String[] words = str.split(" ");

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
