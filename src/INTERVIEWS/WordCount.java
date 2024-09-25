package INTERVIEWS;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "this is a test this is only a test";
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
