package WordPay;

public class HowtosortanArraywithout {

	public static void main(String[] args) {

		/*
		 * Input = array[] = { 10, 5, 20, 63, 12, 57, 88, 60 }; Output = 5 10 12 20 57
		 * 60 63 88
		 */
		int[] array = { 10, 5, 20, 63, 12, 57, 88, 60 };
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] > array[j]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
			System.out.println(array[i]);
		}
	}

}
