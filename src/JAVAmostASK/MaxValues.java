package JAVAmostASK;

/*
 * 15. Find and print the largest element in an array.
// Initialize array
int[] arr = new int[] { 25, 11, 7, 75, 56 };
 */

public class MaxValues {
	public static void main(String[] argStrings) {

		int[] arr = new int[] { 25, 11, 7, 75, 56 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}

		}
		System.out.println(max);

	}

}
