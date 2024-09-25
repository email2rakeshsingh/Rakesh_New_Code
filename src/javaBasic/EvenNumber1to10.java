package javaBasic;

import java.util.Iterator;

public class EvenNumber1to10 {

	public static void main(String[] args) {

		int num = 1;

//		for (num = 0; num <= 10; num++)
//			if (num % 2 == 0) {
//				System.out.println("number is Even :" +num);
//			}
		
		for(num=2;num<=10;num=num+2) {
			System.out.println(num);
		}

	}

}
