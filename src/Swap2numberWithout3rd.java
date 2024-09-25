
public class Swap2numberWithout3rd {

	public static void main(String[] args) {
//write a programe without using 3rd variable 

		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

}
