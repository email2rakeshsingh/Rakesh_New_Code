package StringQuestions;

public class PalindromeString {

	public static void main(String[] args) {

		        String str = "madam";
		        String s2 = "";

		        // Reverse the string
		        for (int i = str.length() - 1; i >= 0; i--) {
		            s2 = s2 + str.charAt(i);
		        }

		        // Check if the original string and the reversed string are the same
		        if (str.equalsIgnoreCase(s2)) {
		            System.out.println("String is a palindrome: " + s2);
		        } else {
		            System.out.println("String is not a palindrome: " + s2);
		        }
		    }
		


		}

	


