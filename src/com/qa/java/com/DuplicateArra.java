package com.qa.java.com;

public class DuplicateArra {

	public static void main(String[] args) {

		String[] arr = { "abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr" };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);

				}
			}
		}
	}

}
