package INT_QUECTIONS_JAVA;

public class StringBuilderclass {
	
	public static void main(String[]args) {
		
		// 2. Using built in reverse() method of the StringBuilder class:
		
		String str= "Rakesh kumar singh";
		
		StringBuilder input = new StringBuilder();
		input.append(str);
		input.reverse();
		System.out.println(input);
	}

}
