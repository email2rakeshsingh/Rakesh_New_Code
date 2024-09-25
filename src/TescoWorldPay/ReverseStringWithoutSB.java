package TescoWorldPay;
public class ReverseStringWithoutSB {
	public static void main(String[] args) {
		String input = "Hello World";
		String reversed = ""; // Initializing an empty string
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed = reversed + input.charAt(i); // Concatenating characters one by one
		}
		System.out.println(reversed); // Printing the reversed string
	}
}
