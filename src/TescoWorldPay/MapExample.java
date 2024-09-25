package TescoWorldPay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		// Step 1: Create a HashMap where the key is Integer and value is
		// ArrayList<String>
		Map<Integer, ArrayList<String>> map = new HashMap<>();

		// Step 2: Create an ArrayList and add values to it
		ArrayList<String> details = new ArrayList<>();
		details.add("John Doe"); // name
		details.add("Software Engineer"); // role

		// Step 3: Put the ArrayList in the Map with the key 1234
		map.put(1234, details);

		// Step 4: Iterate over the Map and print the key and its corresponding values
		for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey()); // Prints the key

			// Step 5: Print the values from the ArrayList
			ArrayList<String> valueList = entry.getValue();
			System.out.println("Values: " + valueList);
		}
	}
}
