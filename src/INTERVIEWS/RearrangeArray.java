package INTERVIEWS;

import java.util.Arrays;

public class RearrangeArray { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3, 0, 0, 12};
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        // Move non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) { 
                result[index++] = arr[i];
            } 
        }

        // Fill remaining positions with zeros
        while (index < n) { 
            result[index++] = 0;
        }

        System.out.println(Arrays.toString(result));
    } 
}
