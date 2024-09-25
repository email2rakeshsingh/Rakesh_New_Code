package JAVA_BASIC_CODE;

import java.util.Scanner;

public class ReveseNumber {

	public static void main(String[] args) {

		// input 123 output 321

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(rev);

	}

}
