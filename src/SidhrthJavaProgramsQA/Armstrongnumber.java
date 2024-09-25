package SidhrthJavaProgramsQA;

public class Armstrongnumber {

	public static void main(String[] args) {
		// 153= 1^3 + 5^3 + 3^3
		
		int num = 153;
		int sum = 0;
		int temp=num;

		while (num > 0) {

			sum = sum + (num % 10)*(num % 10)*(num % 10);
			num = num / 10;
		}
			if (temp == sum) {
				System.out.println("Number is Amrstrong");

			} else {
				System.out.println("Number is not Amrestong");
			}
		}

	

}
