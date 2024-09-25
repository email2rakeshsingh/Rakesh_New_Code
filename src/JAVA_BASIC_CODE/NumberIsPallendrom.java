package JAVA_BASIC_CODE;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class NumberIsPallendrom {

	public static void main(String[] args) {

		// 121 is pallndrom

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int temp = num;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

			if (temp == rev) {
				System.out.println("palladron");

			} else {
				System.out.println("Not pallendron");
			}

		}


}
