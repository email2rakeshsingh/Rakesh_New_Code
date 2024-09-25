package RahulShetty;

public class FabonaciSerise {

	public static void main(String[] args) {
		// 1 , 2, 3, 5, 8, 13, 21,

		int a = 0;
		int b = 1;
		int sum = 0;
		int i=1;
		
		while(i<10) {
			
			sum=a+b;
			   a=b;
			   b=sum;
			
			System.out.println(sum);
			
			i++;
			
			
		}

	}

}
