package javaBasic;

public class ReverseThNumber {
  public static void main (String [] args) {
	int num = 1234;
	int rev = 0;
	 // Variable to store the reversed number

	while (num > 0) {
	    rev = rev * 10 + num % 10;  // Extract the last digit and append it to rev
	    num = num / 10;  // Remove the last digit from num
	}

	System.out.println(rev);  // Print the reversed number


}
}