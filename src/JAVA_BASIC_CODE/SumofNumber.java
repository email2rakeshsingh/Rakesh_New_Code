package JAVA_BASIC_CODE;

public class SumofNumber {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				sum = sum - i;

			} else {
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}

}
