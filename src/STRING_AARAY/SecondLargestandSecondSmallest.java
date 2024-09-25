package STRING_AARAY;

import java.util.Arrays;

public class SecondLargestandSecondSmallest {

	public static void main(String[] args) {

		int[] arrayList = { 4, 2, 3, 1, 0, 6, 12, 15, 20 };

		int sum = arrayList.length;

		Arrays.sort(arrayList);
		System.out.println("second largest element :" + arrayList[sum - 2]);
		System.out.println("second smalest element : " + arrayList[1]);

	}

}
