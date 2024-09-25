package javaBasic;

import javax.sql.rowset.JoinRowSet;

public class LargestNumberof3 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;
		int num3 = 30;

		if (num1 > num2 && num1 > num3) {
			System.out.println("Number 1st is gretest number :" + num1);
		}

		else if (num2 > num3) {
			System.out.println("Number 2nd is gretest number :" + num2);
		} else {
			System.out.println("Number 3rs is biggest number ");
		}

	}

}
