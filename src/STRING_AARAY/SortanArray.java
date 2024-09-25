package STRING_AARAY;

public class SortanArray {
	private static final char[][] arr1 = null;

	/*
	 * Input = array[] = { 10, 5, 20, 63, 12, 57, 88, 60 }; Output = 5 10 12 20 57
	 * 60 63 88
	 */
	public static void main(String[] args) {

		int[] arr1 = { 10, 5, 20, 63, 12, 57, 88, 60 };
		int temp;

		for (int i = 0; i <= arr1.length; i++) {

			for (int j = i + 1; j < arr1.length; j++) {

				if (arr1[i] > arr1[j]) {

					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;

				}
			}

		}

		for (

				int i = 0; i <= arr1.length; i++) {
			System.out.println(arr1[i]);

		}

	}
}