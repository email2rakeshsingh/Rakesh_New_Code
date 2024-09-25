package com.qa.java.com;

public class splitcode {
	/*
	 * 16. Java program to split an alphanumeric digit without using split method
	 * Input = "Welcome234To567Java89Programming0@#!!";
	 * 
	 */

	public static void main(String[] args) {
		String str = "Welcome234To567Java89Programming0@#!!";

		StringBuffer num = new StringBuffer();
		StringBuffer alph = new StringBuffer();
		StringBuffer spacel = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			} else if (Character.isAlphabetic(str.charAt(i))) {
				alph.append(str.charAt(i));
			} else {
				spacel.append(str.charAt(i));
			}

		}

		System.out.println(num);
		System.out.println(alph);
		System.out.println(spacel);
	}

}
