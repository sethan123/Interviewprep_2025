package Interview_Prep_Java.Java_Numbers;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

public class FactorialUsingMap {
	
	private static Map<Integer, Integer> memo = new HashMap<>();
	
	static int factorial(int n)
	{
		if(n<0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers"); 
		}
		if(n==0 || n==1)
		{
			return 1;
		}
		
		if(memo.containsKey(n))
		{
			return memo.get(n);
		}
		
		int result = n * factorial(n-1);
			  memo.put(n, result);
			  return result;
	}
	
	
	

	public static void main(String[] args) {
		int number=5;
		System.out.println(factorial(number));
		
		
	}

}
