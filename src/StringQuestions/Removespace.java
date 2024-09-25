package StringQuestions;

import java.io.InputStream;
import java.util.Scanner;

public class Removespace {
	public static void main(String[] args) {

		// input = "hello java Learning";
		// Output String = “hellojavaLearning”

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Original String " + input);
		String input1 = input.replaceAll("\\s", "");
		System.out.println(input1);

	}

}
