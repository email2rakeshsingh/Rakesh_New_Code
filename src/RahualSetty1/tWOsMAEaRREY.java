package RahualSetty1;

import java.util.ArrayList;

public class tWOsMAEaRREY {

	public static void main(String[] args) {

		int[] a = { 1, 5, 7, 6, 9 };
		int[] b = { 2, 5, 7, 9, 1 };
		// 5, 7, 9
		ArrayList<Integer> commele = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {

					commele.add(a[i]);

				}

			}

		}
		System.out.println(commele);
	}

}
