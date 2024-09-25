package WordPay;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 34, 1 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				second = first; // Update second largest
				first = num; // Update first largest
			} else if (num > second && num != first) {
				second = num; // Update second largest if num is not equal to first
			}
		}

		if (second == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element.");
		} else {
			System.out.println("The second largest element is: " + second);
		}
	}
}
