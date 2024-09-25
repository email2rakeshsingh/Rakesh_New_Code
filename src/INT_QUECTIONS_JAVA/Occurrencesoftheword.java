package INT_QUECTIONS_JAVA;

import StringQuestions.interviewsONLINE;

public class Occurrencesoftheword {

	public static void main(String[] args) {

		// String string = "Java is a programming language. Java is widely used in
		// software Testing";

		String str = "Java is a programming language. Java is widely used in software Testing";
		String[] words = str.toLowerCase().split("\\w+");
		String word = "java";
		int occarence =0;

		for (String e : words) {

			if (e.equals(word)) {
				occarence++;
			
			}
		}
		System.out.println(occarence);
	}

}
