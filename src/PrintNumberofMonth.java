
public class PrintNumberofMonth {

	public static void main(String[] args) {
		// print number of month day in given number

		int month = 76;
		if (month == 1) {
			System.out.println(30);

		} else if (month == 2) {
			System.out.println(31);
		} else if (month == 3) {
			System.out.println(30);
		} else if (month == 5) {
			System.out.println(29);
		} else {
			System.out.println("please enter the currect month ");
		}

	}

}
