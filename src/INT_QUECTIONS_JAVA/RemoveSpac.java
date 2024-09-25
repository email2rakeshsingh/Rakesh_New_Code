package INT_QUECTIONS_JAVA;

public class RemoveSpac {

	/*
	 * . Remove space form given string Input String = “hello java Learning ” Output
	 * String = “hellojavaLearning”
	 */
	public static void main(String[] args) {

		String str = "hello java Learning";
		String s2 = "";

		s2 = str.replaceAll("\\s", "");
		System.out.println(s2);

	}

}
