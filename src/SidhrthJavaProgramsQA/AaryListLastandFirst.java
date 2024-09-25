package SidhrthJavaProgramsQA;

import java.util.ArrayList;

import javax.print.DocFlavor.INPUT_STREAM;

public class AaryListLastandFirst {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 1, 6 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : arr) {
			list.add(i);

		}
		int first = list.get(0);
		System.out.println(first);
		int last = list.get(list.size() - 1);
		System.out.println(last);
	}

}
