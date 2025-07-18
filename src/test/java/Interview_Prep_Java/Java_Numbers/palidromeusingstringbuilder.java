package Interview_Prep_Java.Java_Numbers;

public class palidromeusingstringbuilder {

	public static void main(String[] args) {
		System.out.println(ispalidrome("12345".toLowerCase()));
		System.out.println(ispalidrome("liril".toLowerCase()));
		System.out.println(ispalidrome("toot".toLowerCase()));
		System.out.println(ispalidrome("mic".toLowerCase()));
		
		}
	private static boolean ispalidrome(String string) {
		
		String s = new StringBuilder(string).reverse().toString();
		return string.equals(s);
		
		
	}
	
	
}
