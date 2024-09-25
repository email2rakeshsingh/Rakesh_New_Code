package javaBasic;

public class PaladreamCode {

	public static void main(String[] args) {

		int num = 153;
		int temp=num;
		int sum = 0;

		while (num > 0) {

			sum = sum + (num % 10) * (num % 10) * (num % 10);
			num = num / 10;
				}
			if (sum == temp) {
				System.out.println("Number is Palerdrom");

			} else {
				System.out.println("Number is not Palerdrom");
			}
		}

	}


