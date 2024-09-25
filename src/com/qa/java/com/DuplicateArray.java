package com.qa.java.com;

public class DuplicateArray {
	/*
	 * 11. Removing Duplicates from an Array //using for loop String[] strArray =
	 * {"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"};
	 */
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
