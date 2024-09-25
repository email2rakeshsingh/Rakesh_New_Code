package INTERVIEWS;
import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Iterating using entrySet
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Iterating using keySet
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Iterating using values
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}
