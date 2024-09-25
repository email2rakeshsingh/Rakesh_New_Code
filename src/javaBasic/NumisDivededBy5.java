package javaBasic;

public class NumisDivededBy5 {

	public static void main(String[] args) {

		for (int num = 5; num < 50; num++)

			if (num % 5 == 0) {
				System.out.println("Number is divided by 5 :" + "DIVIDED");
			} else {
				System.out.println("Number is Not divided by 5 :" + num);
			}
	}

}
