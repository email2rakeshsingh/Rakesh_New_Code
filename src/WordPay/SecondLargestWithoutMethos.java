package WordPay;

public class SecondLargestWithoutMethos {

	public static void main(String[] args) {
		int[] arrayList = { 4, 2, 3, 1, 0, 6, 12, 15, 20 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int number : arrayList) {
			if (number > largest) {
				secondLargest = largest;
				largest = number;
			} else if (number > secondLargest && number != largest) {
				secondLargest = number;
			}
		}

		if (secondLargest != Integer.MIN_VALUE) {
			System.out.println("Second largest number is: " + secondLargest);
		} else {
			System.out.println("No second largest number found.");
		}
	}
}
