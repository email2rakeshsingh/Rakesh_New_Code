package com.qa.java.com;

public class SENTANCEREPLACE {
	/*
	 * 9. Reverse the entire sentence Input = "India is country My" Output =
	 * "My country is India"
	 */

	public static void main(String[] args) {

		String[] str = "India is country My".split(" ");
		String ans = "";

		for (int i = str.length - 1; i >= 0; i--) {

			ans = ans + str[i] + " ";
		}
		System.out.println(ans.substring(0, ans.length() - 1));

	}

}
