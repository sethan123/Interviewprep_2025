package Interview_Prep_Java;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeriesUsingcollection {
	
	private static Map<Integer, Integer> memo= new HashMap<>();
	
	
	public static int fibonacci(int n)
	{
		if(n<=1)
			return n;
		
		if (memo.containsKey(n))    
            return memo.get(n);    
		int result = fibonacci(n-1) + fibonacci(n-2);
		memo.put(n,result);
		return result;
	}
		public static void main(String[] args) {
		
			int n=10;
			for(int i=0;i<n;i++)
			{
				System.out.println(fibonacci(i));
			}

	}

}
