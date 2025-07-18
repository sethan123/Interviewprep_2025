package Interview_Prep_Java.Java_Numbers;

public class FactorialUsingrecurision {
		
	
	static int factorial (int fact)
	{
		if(fact==0)
			return 1;
		else
			return (fact*(factorial(fact-1)));
	}
	
	public static void main(String[] args) {
		int n=1;
		int number=5;
		
		System.out.println(n=factorial(number));
				
	}
	
}
