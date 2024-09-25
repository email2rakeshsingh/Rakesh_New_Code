package SidhrthJavaProgramsQA;

import java.util.ArrayList;
import java.util.List;

public class FindingCommonElementsArrays {

	public static void main(String[] args) {

		// array1[]= {4,2,3,1,6};array2= {6,7, 8,4} comman 6,4

		int[] a = { 4, 2, 3, 1, 6 };
		int[] b = { 6, 7, 8, 4 };
		List<Integer> commEleEs = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {

					commEleEs.add(a[i]);

				}

			}
		}
		System.out.println(commEleEs);
	}

}
