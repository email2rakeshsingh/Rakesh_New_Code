package javaBasic;

public class CountOFNumber {

	public static void main(String[] args) {
		
		// input 1234 >>>> out put 4 
		
		int num =154689;
		int count=0;
		
		while (num>0) {
			num=num/10;
			count++;
			
		}
		System.out.println(count);

	}

}
