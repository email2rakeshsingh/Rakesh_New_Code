package SidhrthJavaProgramsQA;

public class ReverseNumbers {

	public static void main(String[] args) {

		int num = 4123;
		int rev = 0;
	      int temp=rev;
		

		while (num > 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}
			if (temp == num) {
				System.out.println("Number is palrdrome ");

			} else {
				System.out.println("Not a plarndrome ");
			}

		}
		
	}


