package INT_QUECTIONS_JAVA;

public class Reverseas {
	/*
	 * 1. Reverse a string Input = mama Output = mama
	 */

	public static void main(String[] args) {

		{
			String str = "mama";
			String s2 = "";

			// Correct the loop to include the first character
			for (int i = str.length() - 1; i >= 0; i--) {
				s2 = s2 + str.charAt(i);
			}

			// Compare the reversed string with the original
			if (str.equalsIgnoreCase(s2)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not a palindrome");
			}
		}
	}

}
// System.out.println(s2.toUpperCase());
