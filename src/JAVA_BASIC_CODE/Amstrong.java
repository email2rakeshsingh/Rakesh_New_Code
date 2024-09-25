package JAVA_BASIC_CODE;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=num;
		int sum = 0;
		

		// 153= 1^3+2^3+3^3+4^3+5^3

		while (num > 0) {
			sum = sum + (num % 10) * (num % 10) * (num % 10);
			num = num / 10;

		}

		if (sum == temp) {
			System.out.println("Amostrong");
		} else {
			System.out.println("Not Amostong");
		}
	}

}
