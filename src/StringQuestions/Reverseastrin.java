package StringQuestions;

public class Reverseastrin {
	public static void main(String[] args) {

		String str = "Rakesh kumar singh";
		String s2 = "";

		for (int i = str.length() - 1; i > 0; i--) {
			s2=s2+str.charAt(i);
			
			
		}
		System.out.println(s2);

	}

}
