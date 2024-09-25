package SidhrthJavaProgramsQA;

public class ReverseString {

	public static void main(String[] args) {

		// input mama output mama

		String str = "Rakesh Singh";
		String s2 = " ";

		for (int i = str.length() - 1; i >= 0; i--) {

			s2 = s2 + str.charAt(i);
			if (str.equalsIgnoreCase(s2)) {
				System.out.println("String is plandrom");

			} else {
				System.out.println("String is not palndrom");
			}

		}
		System.out.println(s2.replace("h", "H"));

	}

}
