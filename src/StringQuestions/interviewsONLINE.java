package StringQuestions;

public class interviewsONLINE {

	public static void main(String[] args) {

		String str = "my_name_is_singh"; // Input string
		String s2 = ""; // To store the reversed string

		// Loop through the string in reverse order and concatenate characters to s2
		for (int i = str.length() - 1; i >= 0; i--) {
			s2 = s2 + str.charAt(i);
		}

		// Output the reversed string
		System.out.println("Reversed string: " + s2); // Output: my_eman_is_hgnis
	}

}
