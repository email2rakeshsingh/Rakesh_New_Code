package RahulShetty;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 15;
		boolean isPrime = true;

		if (num <= 1) {
		    isPrime = false; // 1 and numbers less than 1 are not prime
		} else {
		    for (int i = 2; i <= Math.sqrt(num); i++) {
		        if (num % i == 0) {
		            isPrime = false;
		            break;
		        }
		    }
		}

		if (isPrime) {
		    System.out.println("Number is prime: " + num);
		} else {
		    System.out.println("Number is not prime: " + num);
		}

	}

}
