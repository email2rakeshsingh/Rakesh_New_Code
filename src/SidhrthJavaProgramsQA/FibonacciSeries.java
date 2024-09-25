package SidhrthJavaProgramsQA;

public class FibonacciSeries {

	public static void main(String[] args) {

		// Input = First 10 Numbers
		// Output = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.

		int num1 = 0;
		int num2 = 1;
		int num3;

		for (int i = 0; i <= 10; i++) {
			System.out.print(num1 + " ");
			num3 = num1 + num2;

			num1 = num2;
			num2 = num3;

		}

	}

}
