package javaBasic;

import java.util.Scanner;

public class PerfactNumber {

	public static void main(String[] args) {
		// a perfect number 6 ----> 1, 2, 3

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= 6; i++) {

			if (num % i == 0) {
				System.out.println(i);
				sum = sum + i;
			}

		}
		if (num == sum) {
			System.out.println("Number is perfact");

		} else {
			System.out.println("Number is not perfact");
		}

	}
}
