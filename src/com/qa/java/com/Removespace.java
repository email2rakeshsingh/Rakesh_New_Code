package com.qa.java.com;

/*
 * Remove space form given string
   Input String = “hello java Learning ”
   Output String = “hellojavaLearning”
 */

public class Removespace {
	public static void main(String[] args) {

		String str = "hello java Learning";
		String repString = str.replaceAll("\\s", "");
		System.out.println(repString);

	}

}
