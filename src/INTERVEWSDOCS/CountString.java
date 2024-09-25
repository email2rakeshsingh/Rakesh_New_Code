package INTERVEWSDOCS;

import java.util.HashMap;

public class CountString {

	public static void main(String[] args) {

		String input = "Rakesh Rakesh singh";

		HashMap<Character, Integer> charCountMap = new HashMap<>();

		for (char c : input.toCharArray()) {

			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}

		}
		for (java.util.Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {

			System.out.println(entry.getKey() + "" + entry.getValue());
		}
	}

}
