package javaBasic;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class PalinDrom {
	public static void main(String[] args) {

		// input 121 reverse the number same out put 121

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		int output = num;

		while (num > 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}

			if (rev == output) {
				System.out.println("number is palendrom ");

			} else {
				System.out.println("Number is not palendram");
			}

		}
		}

