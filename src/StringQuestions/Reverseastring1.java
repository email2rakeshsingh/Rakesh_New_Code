package StringQuestions;

public class Reverseastring1 {

	public static void main(String[] args) {

		String str = "Rakesh Kumar Singh";
		String s2 = "";

		for (int i = str.length() - 1; i > 0; i--) {

			s2 = s2 + str.charAt(i);

		}
		System.out.println(s2.toUpperCase());
	}

}
