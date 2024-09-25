package TescoWorldPay;

public class LTMind {
	public static void main(String[] args) {
		// Test input strings
		String[] inputs = { "abc10bcn1", "anc100dfg1", "ght1000mnv1" };

		// Iterate through each input
		for (String input : inputs) {
			System.out.println("Input: " + input);

			// Initialize a StringBuilder to hold the result
			StringBuilder result = new StringBuilder();

			// Loop through each character in the string
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);

				// If the character is a digit, append it to the result
				if (Character.isDigit(ch)) {
					result.append(ch);
				}
			}

			// Print the output
			System.out.println("Output: " + result.toString());
			System.out.println("----------------------");
		}
	}
}
