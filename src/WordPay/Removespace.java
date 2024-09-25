package WordPay;

public class Removespace {

	public static void main(String[] args) {

		/*
		 * 2. Remove space form given string Input String = “hello java Learning ”
		 * Output String = “hellojavaLearning”
		 */

		String str = "hello java Learning";

		String inputString = str.replaceAll("\\s", "");
		System.out.println(inputString);

	}

}
