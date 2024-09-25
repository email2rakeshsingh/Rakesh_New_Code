package SidhrthJavaProgramsQA;

import java.util.HashMap;

/*
 * Find each word occurrence from given string in string java
Input = "Alice is girl and Bob is boy";
Output = {Bob=1, Alice=1, and=1, is=2, girl=1, boy=1}

 */

public class EachWordsOcc {
	public static void main(String[] args) {
		String str = "Alice is girl and Bob is boy";

		HashMap<String, Integer> hashMap = new HashMap<>();

		String[] words = str.split(" ");
		for (String word : words) {

			if (hashMap.containsKey(word)) {
				hashMap.put(word, hashMap.get(word) + 1);

			} else {
				hashMap.put(word, 1);
			}

		}
		System.out.println(hashMap);
	}
}
