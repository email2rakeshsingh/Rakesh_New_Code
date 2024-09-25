package javaBasic;

public class SwitchCode {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;
		String opertion = "mul";

		switch (opertion) {

		case "add":
			System.out.println(num1 + num2);
			break;

		case "mul":
			System.out.println(num1 * num2);
			break;

		case "sub":
			System.out.println(num1 - num2);
			break;
		case "dev":
			System.out.println(num1 / num2);

		default:
			System.out.println("please slect proper values");

		}

	}

}
