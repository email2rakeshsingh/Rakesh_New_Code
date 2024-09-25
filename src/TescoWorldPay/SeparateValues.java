package TescoWorldPay;
import java.util.ArrayList;
import java.util.List;

public class SeparateValues {
	public static void main(String[] args) {
		String str = "Djsieh43oh01832)+#;'ojn8486+&(-)-/";

		List<Character> numbers = new ArrayList<>();
		List<Character> alphabets = new ArrayList<>();
		List<Character> specialChars = new ArrayList<>();

		// Iterate through each character in the string
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				numbers.add(c); // Add to numbers list
			} else if (Character.isLetter(c)) {
				alphabets.add(c); // Add to alphabets list
			} else {
				specialChars.add(c); // Add to special characters list
			}
		}

		// Print the results
		System.out.println("Numbers: " + numbers);
		System.out.println("Alphabets: " + alphabets);
		System.out.println("Special Characters: " + specialChars);
	}
}
