package SidhrthJavaProgramsQA;

import java.util.ArrayList;

public class LastANdFirst {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 6, 9 };
		ArrayList<Integer> list = new ArrayList<Integer>(5);

		for (int i : arr) {
			list.add(i);
		}
		int first = list.get(0);
		System.out.println(first);
		int last = list.get(list.size() - 1);
		System.out.println(last);

	}

}
