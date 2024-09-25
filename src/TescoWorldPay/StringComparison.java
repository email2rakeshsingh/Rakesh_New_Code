package TescoWorldPay;
public class StringComparison {

	public boolean Test1() {
		String first = new String("GlobalLogic");
		String second = new String("GlobalLogic");
		if (first == second) // Compares object references (different objects in heap)
			return true;
		else
			return false;
	}

	public boolean Test2() {
		String first = "GlobalLogic";
		String second = "GlobalLogic";
		if (first == second) // Compares object references (same object in string pool)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		StringComparison comparison = new StringComparison();

		System.out.println("Test1 result: " + comparison.Test1()); // Output: false
		System.out.println("Test2 result: " + comparison.Test2()); // Output: true
	}
}
