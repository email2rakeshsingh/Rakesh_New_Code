package INT_QUECTIONS_JAVA;

import java.util.Arrays;

public class SecondLargestandSecondSma {

	/*
	 * 5. Second Largest and Second Smallest Numbers: // Code to find second largest
	 * and second smallest numbers in an array int[] arrayList = { 4, 2, 3, 1,0,
	 * 6,12,15,20 };
	 * 
	 */
	public static void main(String[] args) {

		int[] arrayList = { 4, 2, 3, 1, 0, 6, 12, 15, 20 };
		int lenNum = arrayList.length;
		System.out.println(lenNum);

		Arrays.sort(arrayList);
		System.out.println("second largest " + arrayList[lenNum - 2]);
		System.out.println("First element " + arrayList[1]);
	}

}
