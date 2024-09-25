package SidhrthJavaProgramsQA;

public class DuplicateArray {

	public static void main(String[] args) {

		/*
		 * Removing Duplicates from an Array // using for loop String[] strArray =
		 * {"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"};
		 */

		String[] strArray = { "abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr" };

		for (int i = 0; i < strArray.length - 1; i++) {

			for (int j = 0; j < strArray.length; j++) {

				if (strArray[i] == strArray[j]) {

				}

				System.out.println(strArray[j]);
			}

		}

	}

}
