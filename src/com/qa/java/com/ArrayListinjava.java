package com.qa.java.com;

import java.util.ArrayList;

public class ArrayListinjava {
	/*
	 * Find first and last element of ArrayList in java Input = array1 = { 4, 2, 3,
	 * 1, 6 }; Output = First is:4, Last is: 6
	 */
	public static void main(String[] args) {

		int[] array1 = { 4, 2, 3, 1, 6 };

		ArrayList<Integer> list = new ArrayList<>();

		list.add(4);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(6);

		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));

	}

}
