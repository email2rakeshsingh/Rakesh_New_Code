package RahulShetty;

public class PrintsTAR {
    public static void main(String[] args) {
        // Loop to manage rows
        for (int i = 1; i < 5; i++) {
            // Loop to print '*' in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print a new line after each row
            System.out.println();
        }
    }
}
