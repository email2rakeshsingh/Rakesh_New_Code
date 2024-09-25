package SidhrthJavaProgramsQA;

import java.util.HashMap;
import java.util.Map;

public class StringBack {

	public static void main(String[] args) {
		{
			String str = "Alice is girl and Bob is boy";
			Map<String, Integer> hashMap = new HashMap<>();
			String[] words = str.split(" ");
			for (String word : words) {
				if (hashMap.containsKey(word))
					hashMap.put(word, hashMap.get(word) + 1);
				else
					hashMap.put(word, 1);
			}
			System.out.println(hashMap);

		}

	}
}
