package StringQuestions;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class Firstandlastelement {

	public static void main(String[] args) {


	
		        // Input array
		        Integer[] array1 = { 4, 2, 3, 1, 6 };

		        // Create an ArrayList and populate it with elements from the array
		        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array1));

		        // Ensure the list is not empty before accessing elements
		        if (!list.isEmpty()) {
		            // Find first element
		            int first = list.get(0);  // First element (4)

		            // Find last element
		            int last = list.get(list.size() - 1);  // Last element (6)

		            // Output the results
		            System.out.println("First is: " + first + ", Last is: " + last);
		        } else {
		            System.out.println("The list is empty.");
		        }
		    }
		}

		



