package RahualSetty1;

public class ArrayDiff {

	public static void main(String[] args) {
		int diff = 0;
		int[] a = { 1, 4, 8, 15, 17 };

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i + 1] - a[i] > diff) {

				diff = a[i + 1] - a[i];

			}
		
		}
		System.out.println(diff);
	}

}
