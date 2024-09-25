package JAVA_BASIC_CODE;

public class SwapValues2Variablewithout3rd {

	public static void main(String[] args) {

		int a = 10;// 20
		int b = 20;// 10

		a = a + b;// 30
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}

}
