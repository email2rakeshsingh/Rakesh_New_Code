package StringQuestions;

public class Removespace1 {

	public static void main(String[] args) {

		// input = "hello java Learning";
		// Output String = “hellojavaLearning”

		String str = "hello java Learning";

		String inputString = str.replaceAll("\\s", "");
		System.out.println(inputString);

	}

}
