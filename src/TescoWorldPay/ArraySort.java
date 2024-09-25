package TescoWorldPay;
public class ArraySort {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 4, 5 };
		System.out.println("Second Max: " + findSecondMax(arr));
	}

	public static int findSecondMax(int[] intArr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int num : intArr) {
			if (num > max) {
				secondMax = max; // Update second max
				max = num; // Update max
			} else if (num > secondMax && num < max) {
				secondMax = num; // Update second max
			}
		}

		return secondMax; // Return the second maximum value
	}
}
