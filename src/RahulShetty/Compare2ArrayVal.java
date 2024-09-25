package RahulShetty;

import java.util.ArrayList;
import java.util.Iterator;

public class Compare2ArrayVal {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int b[] = { 0, 2, 4, 8, 4, 6, 2, 8 };
		ArrayList<Integer> aList = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			if (a[i] == b[i]) {

				aList.add(a[i]);

			}
		}
		Object [] object = aList.toArray();
		for (Object e : object) {

			System.out.println(e);
		}

	}

}
