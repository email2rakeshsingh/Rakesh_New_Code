package javaBasic;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class AddAndSubNumber {
	public static void main(String[] args) {

		// 1+2-3+4+5-6+7+8-9+10
		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0) {
				sum = sum - i;
				if (i % 2 == 0) {
					sum = sum + i;
				}

			} else {
				sum = sum + i;
			}

		}

		System.out.println(sum);
	}

}
