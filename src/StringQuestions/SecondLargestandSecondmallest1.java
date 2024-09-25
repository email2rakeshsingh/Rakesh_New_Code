package StringQuestions;

import java.sql.Array;
import java.util.Arrays;

public class SecondLargestandSecondmallest1 {

	public static void main(String[] args) {

		int[] arrayList = { 4, 2, 3, 1, 0, 6, 12, 15, 20 };

		int num = arrayList.length;
		Arrays.sort(arrayList);

		System.out.println(arrayList[num - 2]);
		System.out.println(arrayList[1]);

	}

}
