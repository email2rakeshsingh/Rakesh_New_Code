package JAVAmostASK;

public class Javaprogramtosplit {
	public static void main(String[] args) {

		// Input = "Welcome234To567Java89Programming0@#!!"

		String str = "Welcome234To567Java89Programming0@#!!";

		StringBuffer num = new StringBuffer();
		StringBuffer alph = new StringBuffer();
		StringBuffer special = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));

			} else if (Character.isAlphabetic(str.charAt(i))) {
				alph.append(str.charAt(i));

			} else {
				special.append(str.charAt(i));
			}

		}
		System.out.println(num);
		System.out.println(alph);
		System.out.println(special);
	}

}
