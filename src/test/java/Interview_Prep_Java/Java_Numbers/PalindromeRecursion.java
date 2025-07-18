package Interview_Prep_Java.Java_Numbers;

public class PalindromeRecursion {

	public static void main(String[] args) {
		
		int num=12021,reverse=0,rem,temp;
		
		if(getreverse(num, reverse)==num)
		{
			System.out.println(num + " is Palidrome");
		}else
		{
			System.out.println(num + " is not Palidrome");
		}

	}

	static int getreverse(int num,int rev)
	
	{
		if(num==0)
			return rev;
		int rem =num%10;
		rev=rev*10+rem;
		return getreverse(num/10, rev);
	}
	
}
