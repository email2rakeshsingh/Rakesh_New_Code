package com.qa.java.com;
public class FindMax {
	public static void main(String[] args) {
		int[] arr = new int[] { 25, 11, 7, 75, 56 };
		int max = arr[0]; // Initialize max with the first element

		// Start loop from 1 since max is already assigned the first element
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) { // Compare current element with max
				max = arr[i]; // Update max if current element is greater
			}
		}

		System.out.println("Maximum value in the array: " + max);
	}
}
