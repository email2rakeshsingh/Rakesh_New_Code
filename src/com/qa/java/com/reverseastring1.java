package com.qa.java.com;

public class reverseastring1 {

	public static void main(String[] args) {

		String str = "madam";
		String s2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			s2 = s2 + str.charAt(i);
		}
		if (str.equalsIgnoreCase(s2)) {
			System.out.println("palandrom");

		} else {
			System.out.println("notPalandrom");
		}

	}
	// System.out.println(s2);
}
