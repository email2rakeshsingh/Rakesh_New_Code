package SidhrthJavaProgramsQA;

public class Arraywithoutusingin {

	/*
	 * 6. How to sort an Array without using inbuilt method? Input = array[] = { 10,
	 * 5, 20, 63, 12, 57, 88, 60 };
	 * 
	 */
	public static void main(String[] args) {

		int temp;

		int[] arr = { 10, 5, 20, 63, 12, 57, 88, 60 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

}
