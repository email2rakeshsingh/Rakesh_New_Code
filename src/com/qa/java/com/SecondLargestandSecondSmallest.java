package com.qa.java.com;

import java.util.Arrays;

public class SecondLargestandSecondSmallest {
	/*
	 * 5. Second Largest and Second Smallest Numbers: // Code to find second largest
	 * and second smallest numbers in an array int[] arrayList = { 4, 2, 3, 1,0,
	 * 6,12,15,20 };
	 */
	public static void main(String[] args) {
		int[] arrayList = { 4, 2, 3, 1, 0, 6, 12, 15, 20 };

		int sum = arrayList.length;

		Arrays.sort(arrayList);

		System.out.println("Second largest element: " + arrayList[sum - 2]);

		System.out.println("Second smallest element: " + arrayList[1]);
	}
}
