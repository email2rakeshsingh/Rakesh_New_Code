package StringQuestions;

public class INT4 {
	public static void main(String[] args) {
		String input = "mY_NAME_IS_RAKESH_SINGH";
		String result = reverseSubstrings(input);
		System.out.println(result);
	}

	public static String reverseSubstrings(String str) {
		String[] parts = str.split("_"); // Split the input string by underscore
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < parts.length; i++) {
			if (i > 0) {
				result.append("_"); // Append the underscore back between sections
			}
			result.append(new StringBuilder(parts[i]).reverse()); // Reverse each part and append to the result
		}

		return result.toString();
	}
}
