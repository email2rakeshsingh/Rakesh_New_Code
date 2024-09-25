package INT_QUECTIONS_JAVA;

import java.util.ArrayList;

public class CommElem {
	/*
	 * String[] array3 = { "Java", "JavaScript", "C", "C++" }; String[] array4 = {
	 * "Python", "C#", "Java", "C++" };
	 */
	public static void main(String[] args) {

		String[] array3 = { "Java", "JavaScript", "C", "C++", "Rakesh" };
		String[] array4 = { "Python", "C#", "Java", "C++", "Rakesh" };
		ArrayList<String> addComm = new ArrayList<String>();

		for (int i = 0; i < array3.length; i++) {

			for (int j = 0; j < array4.length; j++) {

				if (array3[i] == array4[i]) {

					addComm.add(array3[i]);

				}

			}
		}
		System.out.println(addComm);

	}

}
