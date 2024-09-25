package TescoWorldPay;

import java.util.HashMap;

public class duplicateCarecter {
	public static void main(String[] args) {
		String str = "aaabbbcccc";
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		// Count occurrences of each character
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			// Update the count for the character in the HashMap
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		// Print duplicate characters
		System.out.println("Duplicate characters:");
		for (char key : charCountMap.keySet()) {
			if (charCountMap.get(key) > 1) {
				System.out.println(key + ": " + charCountMap.get(key) + " times");
			}
		}
	}
}
