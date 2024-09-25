package javaBasic;

public class SumOfDigit {

	public static void main(String[] args) {

		// input 538 -----------> 6

		int num = 828;
		int sum = 0;

		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;

		}
		System.out.println(sum);
	}

}
