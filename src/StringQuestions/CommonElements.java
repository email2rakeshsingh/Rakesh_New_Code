package StringQuestions;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        // Initialize arrays
        int[] a1 = {10, 3, 56, 78, 7};
        int[] a2 = {2, 9, 3, 45, 67};
        
        // Create an ArrayList to store common elements
        ArrayList<Integer> addComm = new ArrayList<>();

        // Find common elements between a1 and a2
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    // Add common element to ArrayList
                    addComm.add(a1[i]);
                }
            }
        }

        // Print the common elements
        System.out.println("Common elements: " + addComm);
    }
}
