package SidhrthJavaProgramsQA;

/*
 * 7. Counting number of occurrences of given word in a string using Java?
 * String =
 * "Java is a programming language. Java is widely used in software Testing";
 * Input = ”Java”, Output = 2
 */

public class StrOccTest {
	public static void main(String[] args) {

		String str = "Java is a programming language. Java is widely used in software Testing";
		String[] words = str.toLowerCase().split("\\w+");
		String word = "java";
		int occrances = 0;

		for (int i = 0; i <words.length; i++) {
			if (words[i].equals(word)) {

				occrances++;

			}
			System.out.println(occrances);
		}

	}
}
