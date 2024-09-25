package TescoWorldPay;
public class FindDuplicates {
    public static void main(String[] args) {
        String[] strArray = {"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"};

        System.out.println("Brute Force Method: Duplicate Elements are:");
        
        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                // Use .equals() to compare string values
                if (strArray[i].equals(strArray[j])) {
                    System.out.println(strArray[j]);
                    break; // Prevents printing the same duplicate multiple times
                }
            }
        }
    }
}
