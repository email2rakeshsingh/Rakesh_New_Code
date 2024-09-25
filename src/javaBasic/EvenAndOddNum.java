package javaBasic;

public class EvenAndOddNum {

	public static void main(String[] args) {

		for (int num = 2; num < 10; num++)
			if (num % 2 == 0) {
				System.out.println("Even num :" + num);
				if (num == 6) {
					System.out.println("Rakesh");
				}

			}

			else {
				System.out.println("Odd num :" + num);
			}
	}

}
