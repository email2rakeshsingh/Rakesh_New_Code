package RahualSetty1;

public class MultiplicanOfArray {

	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 6, 1 };
		int mul = mulOfAll(a);
		System.out.println(mul);
	}

	public static int mulOfAll(int[] a) {
		int mul = 1;

		for (int i = 0; i < a.length; i++) {
			mul = mul * a[i];
			// System.out.println(mul);

		}

		return mul;

	}

}
