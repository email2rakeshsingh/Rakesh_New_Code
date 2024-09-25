package com.qa.java.com;

import java.util.HashMap;
import java.util.Map;

public class CharOcc {
	/*
	 * /* 10. count the occurrences of each character? Input = "This is an example";
	 * Output = p = 1, a = 2, s = 2, T = 1, e = 2, h = 1, x = 1, i = 2, l = 1, m =
	 * 1, n = 1
	 * 
	 */

	public static void main(String[] args) {

		String str = "You can solve this problem using a simple loop";
		Map<Character, Integer> hasMap = new HashMap<>();

		char[] arr = str.toCharArray();
		for (char c : arr) {
			if (c != ' ') {
				if (hasMap.containsKey(c)) {

					hasMap.put(c, hasMap.get(c) + 1);

				} else {
					hasMap.put(c, 1);
				}

			}

		}
		for (Map.Entry entry : hasMap.entrySet()) {

			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

	}

}
