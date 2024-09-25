package SidhrthJavaProgramsQA;

import java.util.Scanner;

public class Removespaceformgivenstring {

	public static void main(String[] args) {

		/*
		 * 2. Remove space form given string Input String = “hello java Learning ”
		 * Output String = “hellojavaLearning
		 */
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		System.out.println("Enter the string :"+ input);
		
		input =input.replaceAll("\\s", "");
		System.out.println("Enter the string:"+input);
		
		
		

	}

}
