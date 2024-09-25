package JAVA_BASIC_CODE;

public class Claculator_Switch {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;

		String operation = "sub";

		switch (operation) {
		case "add":
			System.out.println(a + b);
			break;
		case "mul":
			System.out.println(a * b);
			break;
		case "sub":
			System.out.println(a - b);
			break;
		case "div":
			System.out.println(a / b);
			break;

		}

	}

}
