package WordPay;

import java.util.Arrays;

public class SecondLarges {

	public static void main(String[] args) {

		/*
		 * mallest numbers in an array int[] arrayList = { 4, 2, 3, 1,0, 6,12,15,20 };
		 */
		int[] arrayList = { 4, 2, 3, 1, 0, 6, 12, 15, 20 };

		int length = arrayList.length;

		Arrays.sort(arrayList);
		System.out.println(arrayList[length - 2]);
		System.out.println(arrayList[1]);
	}
}
