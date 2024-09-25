package TescoWorldPay;
public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {12, 17, 5, 35, 44, 91, 8};

        // Use nested loops to sort the array in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Swap if the current element is smaller than the next
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // After sorting, print the second highest element
        System.out.println("Second highest element: " + arr[1]);
    }
}
