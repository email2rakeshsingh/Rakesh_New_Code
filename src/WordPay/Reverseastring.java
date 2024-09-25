package WordPay;

public class Reverseastring {

	public static void main(String[] args) {

		/*
		 * 
		 */
		String str = "madam";
		String s2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			s2 = s2 + str.charAt(i);

		}
		System.out.println(s2);
		if (str.equalsIgnoreCase(s2)) {
			System.out.println("Palandrome");
		} else {
			System.out.println("Not a palndrome");
		}
	}

}
