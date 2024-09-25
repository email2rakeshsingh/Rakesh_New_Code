package JAVAmostASK;

public class split {
	public static void main(String[] args) {

		// Input = "Welcome234To567Java89Programming0@#!!"

		String str = "Welcome234To567Java89Programming0@#!!";

		StringBuffer num = new StringBuffer();
		StringBuffer alph = new StringBuffer();
		StringBuffer specl = new StringBuffer();
		{

			for (int i = 0; i < str.length(); i++) {

				char ch = str.charAt(i);

				if (Character.isDigit(ch)) {
					num.append(ch);
				} else if (Character.isAlphabetic(ch)) {
					alph.append(ch);
				} else {
					specl.append(ch);
				}

			}

		}
		System.out.println(num);
		System.out.println(alph);
		System.out.println(specl);
	}
}