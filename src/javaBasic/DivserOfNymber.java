package javaBasic;

import java.security.PublicKey;

public class DivserOfNymber {

	public static void main(String[] args) {

		// input 6 = output 1, 2 ,3, 6,

		int num = 10;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				System.out.println(i);
			}
		}
		
	}

}
