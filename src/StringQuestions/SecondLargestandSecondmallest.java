package StringQuestions;

import java.util.Arrays;

public class SecondLargestandSecondmallest {

	public static void main(String[] args) {

		int[] arrayList = {4, 2, 3, 1, 0, 6, 12, 15, 20 };

		int num = arrayList.length;

		Arrays.sort(arrayList);
		System.out.println("Second largest number is +" + arrayList[num - 2]);
		System.out.println("secon smallest number is " + arrayList[1]);

	}

}
