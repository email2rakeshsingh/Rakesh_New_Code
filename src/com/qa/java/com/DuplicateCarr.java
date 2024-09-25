package com.qa.java.com;

public class DuplicateCarr {
	/*
	 * 14. How to print duplicate characters from the string? Input =
	 * "apple is fruit"; Output = p i
	 * 
	 */
	public static void main(String[] args) {
		String str = "apple is fruit";
		char[] arr = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

				if (arr[i] == arr[j]) {
					System.out.println(arr[j] + "");
				}
			}

		}

	}

}
