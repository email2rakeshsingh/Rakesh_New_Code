package INTERVIEWS;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters { 
    public static void main(String[] args) { 
        String str = "programming";
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) { 
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        } 
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) { 
            if (entry.getValue() > 1) { 
                System.out.println("Character " + entry.getKey() + " occurs " + entry.getValue() + " times.");
            } 
        } 
    } 
}
