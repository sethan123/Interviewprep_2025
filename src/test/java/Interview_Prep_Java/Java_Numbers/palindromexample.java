package Interview_Prep_Java.Java_Numbers;

public class palindromexample {

	public static void main(String[] args) {
		int r,sum=0,temp;
		int n=454;		
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		
		if(temp==sum)
			System.out.println("Palidrome Number");
	else
		System.out.println("Non Palidrome Number");

}
}