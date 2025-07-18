package Interview_Prep_Java.Java_Numbers;

import java.util.Scanner;

public class PalindromeExample2 {

	public static void main(String[] args) {
		String org,reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		org=sc.nextLine();
		
		int length = org.length();
		
		for(int i=length-1;i>=0;i--)
			reverse= reverse + org.charAt(i);
			
		if(org.equals(reverse))
			System.out.println("Entered string is palidrome");
		else
			System.out.println("Entered string is not a palidrome");
	}

}
