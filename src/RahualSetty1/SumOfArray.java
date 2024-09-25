package RahualSetty1;

import java.util.Iterator;

public class SumOfArray {

	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 6, 7, };
		int sum = SumOfArray(a);
		System.out.println(sum);
	}
	private static int SumOfArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
		sum = sum + a[i];
		}
		// System.out.println(sum);
		return sum;
	}

}
