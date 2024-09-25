package INT_QUECTIONS_JAVA;

import java.util.ArrayList;

public class CommEl {
	/*
	 * Input = array1 = { 4, 2, 3, 1, 6 }; array2 = { 6, 7, 8, 4 }; Output = 6,4
	 */
	public static void main(String[] args) {

		int arr1[] = { 4, 2, 3, 1, 6 };
		int arr2[] = { 6, 7, 8, 4 };
		ArrayList<Integer> commadd = new ArrayList<Integer>();

		// output [6,4]

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					commadd.add(arr1[i]);

				}

			}

		}
		System.out.println(commadd);

	}

}
