package WordPay;

public class StringOccrance {
	public static void main(String[] args) {

		String str = "Java is a programming language. Java is widely used in software Testing";

		String[] words = str.split(" ");
		String word = "java";
		int occrances = 0;
		for (String e : words) {

			if (e.equalsIgnoreCase(word)) {
				occrances++;

			}
		}
		System.out.println(occrances);

	}

}
