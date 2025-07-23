package Interview_Prep_Java.Java_Numbers;

public class LeftTranglePattern {

	public static void main(String[] args) {
		int z=10;
		for(int i=1;i<=z;i++)
		{
			for(int j=2*(z-i);j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		

	}

}
