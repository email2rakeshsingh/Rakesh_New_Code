package SidhrthJavaProgramsQA;
/*
 * 7. Counting number of occurrences of given word in a string using Java?
 * String =
 * "Java is a programming language. Java is widely used in software Testing";
 * Input = ”Java”, Output = 2
 */

public class occrence {
	public static void main(String[] args) {

		String str = "Java is a programming is language. Java is widely used in software Testing";
		String[] wordS = str.toLowerCase().split("\\W+"); // Split by non-word characters
		String word = "is";
		int occurrences = 0;

		for (int i = 0; i < wordS.length; i++) {
			if (wordS[i].equals(word)) {
				occurrences++;
			}

		}
		System.out.println(occurrences);
	}
}
