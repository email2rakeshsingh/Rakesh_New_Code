package StringQuestions;

public class SortanArray {
	public static void main(String[] args) {

		/*
		 * Input = array[] = { 10, 5, 20, 63, 12, 57, 88, 60 }; Output = 5 10 12 20 57
		 * 60 63 88
		 */
	{
		        int temp;
		        int array[] = { 10, 5, 20, 63, 12, 57, 88, 60 };

		        // Sorting the array in ascending order
		        for (int i = 0; i < array.length; i++) {
		            for (int j = i + 1; j < array.length; j++) {
		                if (array[i] > array[j]) {
		                    // Swapping logic
		                    temp = array[i];
		                    array[i] = array[j];
		                    array[j] = temp;
		                }
		            }
		        }

		        // Printing the sorted array
		        for (int i = 0; i < array.length; i++) {
		            System.out.println(array[i]);
		        }
		    }
		}


	}


