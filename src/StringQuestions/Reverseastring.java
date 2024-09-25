package StringQuestions;

import javax.print.DocFlavor.INPUT_STREAM;

public class Reverseastring {

	public static void main(String[] args) {

		String str = "mama";
		String s2 = "";

		/*
		 * 1. Reverse a string Input = mama Output = mama
		 */

		for (int i = str.length() - 1; i >= 0; i--) {

			s2 = s2 + str.charAt(i);
			// below is code to check weather given string is Palindrome or not
			
			if(s2.equalsIgnoreCase(s2)) {
				System.out.println("String is palandrome");
					
				}
				else {
					System.out.println("String is not palandrome");
				}
				
			}
		System.out.println(s2);
		}

	//. Using built in reverse() method of the StringBuilder class:
	

	
	       
	}


