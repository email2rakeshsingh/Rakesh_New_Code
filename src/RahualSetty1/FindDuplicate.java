package RahualSetty1;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 2, 5, 6, 3 };

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j <array.length; j++) {

				if (array[i] == array[j]) {

					System.out.println(array[i]);
				}

			}

		}

	}

}
