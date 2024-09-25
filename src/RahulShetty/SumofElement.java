package RahulShetty;

public class SumofElement {
	
	// create a method which accepts Array and return all the element in Array 

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int sum= sumArray(a);
		System.out.println(sum);

	}

	public static int sumArray(int[]a) {
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
		    sum=sum+a[i];
		}
		
		return sum;
		
		
		
		
	}

}
