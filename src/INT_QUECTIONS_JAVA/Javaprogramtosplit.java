package INT_QUECTIONS_JAVA;

public class Javaprogramtosplit {
	public static void main(String[] args) {
		/*
		 * Input = "Welcome234To567Java89Programming0@#!!"; Output:
		 * WelcomeToJavaProgramming 234567890
		 * 
		 * @#!!
		 */

		String str = "Welcome234To567Java89Programming0@#!!";

		StringBuffer string = new StringBuffer(); // For alphabets
		StringBuffer num = new StringBuffer(); // For digits
		StringBuffer spacel = new StringBuffer(); // For special characters

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			} else if (Character.isAlphabetic(str.charAt(i))) {
				string.append(str.charAt(i));
			} else {
				spacel.append(str.charAt(i));
			}
		}
		System.out.println(string); // Prints alphabets combined into a string
		System.out.println(num); // Prints digits combined into a string
		System.out.println(spacel); // Prints special characters
	}
}
