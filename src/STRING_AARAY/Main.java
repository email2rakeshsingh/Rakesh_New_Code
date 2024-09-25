package STRING_AARAY;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] array1 = { 4, 2, 3, 1, 6 };

		// Create an ArrayList and add elements from array1
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 3, 1, 6));

		// Get the first and last elements
		int first = list.get(0);
		System.out.println("First element: " + first);

		int last = list.get(list.size() - 1);
		System.out.println("Last element: " + last);
	}
}
