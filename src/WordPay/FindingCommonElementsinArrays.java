package WordPay;

import java.util.ArrayList;
import java.util.List;

public class FindingCommonElementsinArrays {

	public static void main(String[] args) {

		/*
		 * 3. Finding Common Elements in Arrays Input = array1 = { 4, 2, 3, 1, 6 };
		 * array2 = { 6, 7, 8, 4 }; O utput = 6,4
		 */

		int[] array1 = { 4, 2, 3, 1, 6 };
		int[] array2 = { 6, 7, 8, 4 };
		List<Integer> addlist = new ArrayList<>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {

				if (array1[i] == array2[j]) {

					addlist.add(array1[i]);
				}

			}

		}
		System.out.println(addlist);
	}

}
