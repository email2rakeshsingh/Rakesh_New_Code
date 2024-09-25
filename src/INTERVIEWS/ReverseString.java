package INTERVIEWS;
public class ReverseString {
    public static void main(String[] args) {
        String input = "hello"; // Input string to be reversed
        String reversed = ""; // Initialize an empty string to store the reversed result

        // Loop through the string from end to start
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append each character in reverse order
        }

        System.out.println(reversed); // Output the reversed string
    }
}
