package Interview_Prep_Java.Java_Numbers;

import java.util.Random;

public class GenerateRandomnumber {

	public static void main(String[] args) {
		
		
		
		System.out.println(Math.random());

		Random random = new Random(); 
		int a=200;
		int b=300;
		int c1 = Math.max(a, b);
		int c= (int) Math.random()*(b-a+1)+a;
		boolean z=random.nextBoolean(); 
		System.out.println(z);
		System.out.println(c);
	}

}
