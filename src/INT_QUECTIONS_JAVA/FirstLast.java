package INT_QUECTIONS_JAVA;

import java.util.ArrayList;

public class FirstLast {

	/*
	 * . Find first and last element of ArrayList in java Input = array1 = { 4, 2,
	 * 3, 1, 6 }; Output = First is:4, Last is: 6
	 * 
	 */
	public static void main(String[] args) {

		int[] array1 = { 4, 2, 3, 1, 6 };

		int length = array1.length;
		System.out.println(length);

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(6);

		int firstLenth = list.get(0);
		System.out.println(firstLenth);

		int last = list.get(list.size() - 1);
		System.out.println(last);

	}

}
