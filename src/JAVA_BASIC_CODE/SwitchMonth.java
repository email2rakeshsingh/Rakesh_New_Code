package JAVA_BASIC_CODE;

import javaBasic.ZigJagNumber;

public class SwitchMonth {

	public static void main(String[] args) {

		int month = 8;

		switch (month) {
		case 1:
			System.out.println("30 days");
			break;

		case 2:
			System.out.println("28 days");
			break;

		case 3:
			System.out.println("27 days");
			break;
			
		case 4:
			System.out.println("31 days");
			break;
			
		case 5:
			System.out.println("76 days");
			break;
			
		case 6:
			System.out.println("31 days");
			break;
			
		case 7:
			System.out.println("28 days");
			break;
			
		case 8:
			System.out.println("29 days");
			break;
			
		case 9:
			System.out.println("26 days");
			break;
			
		default: {
			System.out.println("please enter the correct values ");
		}
		}

	}

}
