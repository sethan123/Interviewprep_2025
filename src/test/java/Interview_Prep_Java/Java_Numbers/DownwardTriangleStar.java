package Interview_Prep_Java.Java_Numbers;

public class DownwardTriangleStar {

	public static void main(String[] args) {
		int row=10;
		for(int i=(row-1);i>0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
