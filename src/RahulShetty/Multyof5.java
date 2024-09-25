package RahulShetty;

public class Multyof5 {
	public static void main(String[] args) {
		int result = Multyof5(5, 10);
		System.out.println(result);

	}

	private static int Multyof5(int i, int j) {

		int Multyof5 = 0;

		for (int k = 1; k <=j; k++) {

			Multyof5 = Multyof5 + i;

		}
		return Multyof5;
	}
}