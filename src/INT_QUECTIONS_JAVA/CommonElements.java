package INT_QUECTIONS_JAVA;

import java.util.ArrayList;

import StringQuestions.SortanArray1;
import StringQuestions.interviewsONLINE;

public class CommonElements {

	public static void main(String[] args) {

		/*
		 * 3. Finding Common Elements in Arrays Input = array1 = { 4, 2, 3, 1, 6 };
		 * array2 = { 6, 7, 8, 4 }; Output = 6,4
		 */
		String[] array1 = { "Java", "JavaScript", "C", "C++" };
		String[] array2 = { "Python", "C#", "Java", "C++" };
		// Output = 6,4

		ArrayList<String> addNew = new ArrayList<String>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {

				if (array1[i] == array2[j]) {
					addNew.add(array1[i]);
					

				}
			
			}

		}	System.out.println(addNew);

	}

}
