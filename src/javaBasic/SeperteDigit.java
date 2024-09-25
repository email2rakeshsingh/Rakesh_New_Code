package javaBasic;

public class SeperteDigit {

	public static void main(String[] args) {

		// 123 3,2,1

		int num = 23456789;

		while (num != 0) {
             System.out.println(num%10);
             
             num=num/10;
        
		}
		 System.out.println(num);    
	}

}
