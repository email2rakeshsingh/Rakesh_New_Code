package INT_QUECTIONS_JAVA;

import java.util.Arrays;

import StringQuestions.interviewsONLINE;

public class SecondLargestandSecondSmallest {

	public static void main(String[] args) {
		/*
		 * Second Largest and Second Smallest int[] arrayList = { 4, 2, 3, 1,0,
		 * 6,12,15,20 };
		 */

		int[] arrayList = { 4, 2, 3, 1, 0, 6, 12, 15, 20 };

		int num = arrayList.length;

		Arrays.sort(arrayList);

		System.out.println(arrayList[num - 2]);
		System.out.println(arrayList[1]);
	}

}
