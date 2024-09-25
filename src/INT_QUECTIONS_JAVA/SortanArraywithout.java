package INT_QUECTIONS_JAVA;

import StringQuestions.interviewsONLINE;

public class SortanArraywithout {

	public static void main(String[] args) {

		/*
		 * 6. How to sort an Array without using inbuilt method? Input = array[] = { 10,
		 * 5, 20, 63, 12, 57, 88, 60 }; Output = 5 10 12 20 57 60 63 88
		 */

		int temp, size;

		int[] array = { 10, 5, 20, 63, 12, 57, 88, 60 };

		size = array.length;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {

				if (array[i] > array[j]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

	}

}
