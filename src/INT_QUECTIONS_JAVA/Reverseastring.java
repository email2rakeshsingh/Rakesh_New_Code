package INT_QUECTIONS_JAVA;

import java.io.InterruptedIOException;

import StringQuestions.interviewsONLINE;

public class Reverseastring {
	public static void main(String[] argS) {

		/*
		 * 1. Reverse a string Input = mama Output = mama
		 */

		String str = "Rakesh_singh";
		String s2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			s2 = s2 + str.charAt(i);

		}
		System.out.println("revers string :" + s2);

	}

}
