package com.qa.java.com;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {
	/*
	 * 10. count the occurrences of each character? Input = "This is an example";
	 * Output = p = 1, a = 2, s = 2, T = 1, e = 2, h = 1, x = 1, i = 2, l = 1, m =
	 * 1, n = 1
	 * 
	 */

	public static void main(String[] args) {
		String str = "This is an example";
		HashMap<Character, Integer> hashMap = new HashMap<>();

		char[] arr = str.toCharArray();

		for (char c : arr) {
			if (c != ' ') {
				if (hashMap.containsKey(c)) {
					hashMap.put(c, hashMap.get(c) + 1);
				} else {
					hashMap.put(c, 1);
				}
			}
		}

		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue() + " ,");
		}
	}
}
