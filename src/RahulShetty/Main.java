package RahulShetty;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int temp;
        int[] a = { 1, 3, 5, 6, 8, 2 };

        // Sorting the array using selection sort algorithm
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Printing the sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


		

	}

