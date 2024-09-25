package WordPay;

public class Countingnumberofoccurrences {

	public static void main(String[] args) {

		/*
		 * String =
		 * "Java is a programming language. Java is widely used in software Testing";
		 * Input = ”Java”, Output = 2
		 * 
		 */
		String str = "Java is a programming language. Java is widely used in software Testing";

		String[] words = str.split(" ");
		String word = "java";
		int occurrences = 0;

		for (String e : words) {
			// Use equalsIgnoreCase to make it case-insensitive
			if (e.equalsIgnoreCase(word)) {
				occurrences++;
			}
		}

		// Print the final count
		System.out.println("Occurrences of '" + word + "': " + occurrences);

	}

}
