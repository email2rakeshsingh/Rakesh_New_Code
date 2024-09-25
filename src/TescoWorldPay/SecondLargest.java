package TescoWorldPay;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arrayList = {4, 2, 3, 1, 0, 6, 12, 15, 20};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arrayList) {
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num;           // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;     // Update second largest if num is between
            }
        }

        System.out.println("Second Largest element is " + secondLargest);
    }
}
