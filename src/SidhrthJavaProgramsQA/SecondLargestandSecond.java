package SidhrthJavaProgramsQA;

import java.util.Arrays;

public class SecondLargestandSecond {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7, 9, 2, };

		int num = arr.length;
		Arrays.sort(arr);
		System.out.println(+arr[num - 2]);
		System.out.println(+arr[num - 1]);
	}

}
