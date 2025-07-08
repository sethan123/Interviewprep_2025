package Interview_Prep_Java.Java_Numbers;

public class FibonacciSeriesUsingRecursion {
	
	static int n=0,n1=1,n3=0;
	static void printFibonacci(int count) {
		if(count>0)
		{
			n3=n+n1;
			n= n1;
			n1= n3;
			System.out.println(n3);
			printFibonacci(count-1);
		}
	}
	
	

	public static void main(String[] args) {		
		int count=10;      
		  System.out.println(n+" \n"+n1);         
		  printFibonacci(count-2);
		
	}

}
