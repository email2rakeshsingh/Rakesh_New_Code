package RahulShetty;

public class MinandMaxNumberinArray {

	public static void main(String[] args) {

		
				int abc[][] = { { 7, 2, 3 }, { 5, 7, 3 }, { 9, 3, 9 } };

				// Initialize min to the first element of the array
				int min = abc[0][0];

				// Iterate over the 2D array
				for (int i = 0; i < abc.length; i++) {
					for (int j = 0; j < abc[i].length; j++) {
						// Update min if a smaller value is found
						if (abc[i][j] < min) {
							min = abc[i][j];
						}
					}
				}

				// Print the minimum value found
				System.out.println("Minimum value: " + min);
			
	}
}
