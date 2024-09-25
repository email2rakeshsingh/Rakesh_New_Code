package TescoWorldPay;

public class ExtractNumbersFromString {
	public static void main(String[] args) {
		// Test input strings
		String[] inputs = { "abc10bcn1", "anc100dfg1", "!@#1000mnv1" };

		// Iterate through each input
		for (String input : inputs) {
			System.out.println("Input: " + input);

			// Initialize an empty string to hold the result
			String result = "";

			// Loop through each character in the string
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);

				// If the character is a digit, append it to the result
				if (Character.isDigit(ch)) {
					result += ch;
				}
			}

			// Print the output
			System.out.println("Output: " + result);
			System.out.println("----------------------");
		}
	}
}
