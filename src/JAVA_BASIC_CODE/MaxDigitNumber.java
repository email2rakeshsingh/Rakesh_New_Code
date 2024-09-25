package JAVA_BASIC_CODE;

import java.util.Scanner;

public class MaxDigitNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int max = 0;
		while (num > 0) {
			if (num % 10 > max) {

				max = num % 10;
			}
			num = num / 10;

		}
		System.out.println(max);

	}

}
