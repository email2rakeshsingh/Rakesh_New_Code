package TescoWorldPay;
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 12};  // Input array
        int count = 0;  // Keeps track of the index for non-zero elements
        
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];  // Place non-zero element at 'count'
                count++;  // Move to the next index
            }
        }
        
        // Fill the remaining array with zeros
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
        
        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
