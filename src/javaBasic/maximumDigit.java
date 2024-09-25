package javaBasic;

import java.util.Scanner;

public class maximumDigit {

	public static void main(String[] args) {

		// input 349 output 9

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = num % 10;

		while (num > 0) {

			if (num % 10 > max) {
				max = num % 10;

			}
			num = num / 10;

		}
		System.out.println(max);

	}

}
