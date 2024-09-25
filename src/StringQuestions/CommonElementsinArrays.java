package StringQuestions;

import java.util.ArrayList;

public class CommonElementsinArrays {

	public static void main(String[] args) {

		/*
		 * Input = array1 = { 4, 2, 3, 1, 6 }; array2 = { 6, 7, 8, 4 }; Output = 6,4
		 */

		int[] arr1 = { 4, 2, 3, 1, 6 };
		int[] arr2 = { 6, 7, 8, 4 };

		ArrayList<Integer> addNew = new ArrayList<>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) { // Corrected the increment variable

				if (arr1[i] == arr2[j]) {
					addNew.add(arr1[i]);
				}
			}
		}

		System.out.println(addNew); // Moved outside of the loop
	}

}
