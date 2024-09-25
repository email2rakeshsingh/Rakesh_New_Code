package StringQuestions;

public class SortanArray2 {

	public static void main(String[] args) {

		int temp = 0;

		int array[] = { 10, 5, 20, 63, 12, 57, 88, 60 };

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
	}
}
