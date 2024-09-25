package STRING_AARAY;

public class Removespace {

	/*
	 * 2. Remove space form given string Input String = “hello java Learning ”
	 * Output String = “hellojavaLearning”
	 */
	public static void main(String[] args) {

		String str = "hello java Learning";

		String input = str.replaceAll("\\s", "");
		System.out.println(input);

	}

}
