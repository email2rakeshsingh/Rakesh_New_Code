package INTERVIEWS;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "hello world";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (c != ' ') { // Ignore spaces if not needed
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
