package TescoWorldPay;
public class DivisibilityCheck {
	public static void main(String[] args) {
		int num = 15;

		// Define the variables
		String firstName = "John";
		String middleName = "Doe";
		String fullName = firstName + " " + middleName;

		// Check if num is divisible by 3 and 5 first
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Divided by 3 and 5: " + fullName);
		}
		// Check if num is divisible by 3
		else if (num % 3 == 0) {
			System.out.println("Divided by 3: " + firstName);
		}
		// Check if num is divisible by 5
		else if (num % 5 == 0) {
			System.out.println("Divided by 5: " + middleName);
		}
		// If num is not divisible by 3 or 5
		else {
			System.out.println("Number is not divisible by 3 or 5.");
		}
	}
}
