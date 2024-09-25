package javaBasic;

import java.awt.desktop.AboutHandler;

public class NumberDividedBy3or5 {

	public static void main(String[] args) {

		for (int num = 1; num <= 50; num++) {

			if (num % 3 == 0 || num % 5 == 0) {
				System.out.println("print number :" + num);
			}

		}

	}
}
