package Interview_Prep_Java.Java_Numbers;

public class Prime_Number_In_Optimation {
	
	
	
	static boolean isPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) 
			if(n%i==0)
					return false;
			return true;
		}
	
	
	

	public static void main(String[] args) {
		int num=67;
		if(isPrime(num))
			System.out.println(num +"  Prime number");
		else System.out.println(num +"  Not a prime number");
		
		
	}

}
