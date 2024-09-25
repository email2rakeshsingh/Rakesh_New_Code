package SidhrthJavaProgramsQA;

import java.util.ArrayList;
import java.util.Iterator;

public class DuplicateValuesInAaary {

	public static void main(String[] args) {
		/*
		 * Finding Common Elements in Arrays Input = array1 = { 4, 2, 3, 1, 6 }; array2
		 * = { 6, 7, 8, 4 }; Output = 6,4 }
		 */

		int array1[] = { 4, 2, 3, 1, 6 };
		int array2[] = { 6, 7, 8, 4 };
		ArrayList<Integer> commVaList = new ArrayList<>();

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array2.length; j++) {

				if (array1[i] == array2[j]) {

					commVaList.add(array1[i]);

				}
			}
		}
		System.out.println("Comman values in List : " + commVaList);
	}
}
