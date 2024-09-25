package JAVA_BASIC_CODE;

import java.awt.desktop.AboutHandler;

public class MaxNumberOutof3Number {

	public static void main(String[] args) {

		// input 20,30,50 so max number 50

		int num1 = 2808;
		int num2 = 300;
		int num3 = 50;

		if (num1 > num2 && num1 > num3) {
			System.out.println("Num1 is greatest");
		} else if (num2 > num3) {
			System.out.println("Num2 is greatest");
		} else {
			System.out.println("Num3 is greatest");
		}

	}

}
