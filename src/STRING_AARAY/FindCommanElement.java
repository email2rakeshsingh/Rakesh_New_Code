package STRING_AARAY;

import java.util.ArrayList;

public class FindCommanElement {
	/*
	 * 3. Finding Common Elements in Arrays Input = array1 = { 4, 2, 3, 1, 6 };
	 * array2 = { 6, 7, 8, 4 }; Output = 6,4
	 */
	public static void main(String[] args) {

		int[] array1 = { 4, 2, 3, 1, 6 };
		int[] array2 = { 6, 7, 8, 4 };

		ArrayList<Integer> commAddArrayList = new ArrayList<Integer>();

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array2.length; j++) {

				if (array1[i] == array2[j]) {
					commAddArrayList.add(array1[i]);

				}

			}

		}
		System.out.println(commAddArrayList);
	}

}
