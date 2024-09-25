package WordPay;

import java.util.ArrayList;
import java.util.List;

public class Findfirstandlastelement {
	public static void main(String[] args) {

		/*
		 * Input = array1 = { 4, 2, 3, 1, 6 }; Output = First is:4, Last is: 6
		 */
		int[] array1 = { 4, 2, 3, 1, 6 };

		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(6);

		int size = list.size();

		System.out.println(list.get(0));
		System.out.println(list.get(size - 2));

	}

}
