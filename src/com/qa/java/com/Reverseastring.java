package com.qa.java.com;

/*
 * . Reverse a string
          Input = mama
          Output = mama
 */
public class Reverseastring {
	public static void main(String[] args) {

		String str = "SINGH";
		String s2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			s2 = s2 + str.charAt(i);

		}
		System.out.println(s2);

	}

}
