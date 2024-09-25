package StringQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class retainAll1 {

	public static void main(String[] args) {

		/*
		 * Input = array1 = { 4, 2, 3, 1, 6 }; array2 = { 6, 7, 8, 4 }; Output = 6,4
		 * 
		 */

		Integer[] array1 = { 4, 2, 3, 1, 6 };
		Integer[] array2 = { 6, 7, 8, 4 };

		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));

		list1.retainAll(list2);
		System.out.println(list1);

	}

}
