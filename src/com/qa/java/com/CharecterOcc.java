package com.qa.java.com;
import java.util.HashMap;
import java.util.Map;

public class CharecterOcc {
    public static void main(String[] args) {
        String input = "This is an example";
        countCharacterOccurrences(input);
    }

    public static void countCharacterOccurrences(String input) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the input string to a character array
        char[] chars = input.toCharArray();
        
        // Loop through each character in the array
        for (char c : chars) {
            // Skip spaces
            if (c == ' ') {
                continue;
            }
            // If character is already in map, increment the count
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the character occurrences
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
