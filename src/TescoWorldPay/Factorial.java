package TescoWorldPay;
public class Factorial {
	public static void main(String[] args) {
		int num = 5; // The number to calculate the factorial for
		int fact = 1; // Variable to store the factorial

		// Start loop from 1 and go up to num
		for (int i = 1; i <= num; i++) {
			fact = fact * i; // Multiply fact by i for each iteration
		}

		// Print the factorial result
		System.out.println("Factorial of " + num + " is: " + fact);
	}
}
