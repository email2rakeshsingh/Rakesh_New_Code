package StringQuestions;

import java.security.PublicKey;

public class DuplicateArray {

	public static void main(String[] args) {

		String[] strArray = { "abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr" };

		// Brute Force Method
		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].equals(strArray[j])) {
					System.out.println("Brute Force Method: Duplicate Element is: " + strArray[j]);
				}
			}
		}

	}

}
