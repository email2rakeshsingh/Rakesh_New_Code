package INT_QUECTIONS_JAVA;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import StringQuestions.interviewsONLINE;

public class stringisPalindrome {

	public static void main(String[] args) {

		/*
		 * 1. Reverse a string palandrom Test Input = mama Output = mama
		 */

		String str = "mama";
		String s2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			s2 = s2 + str.charAt(i);

			if (str.equalsIgnoreCase(s2)) {

				System.out.println("String is plandrome :" + s2);
			} else {
				System.out.println("String is not palandrome: " + s2);
			}
		}

	}

}
