import java.util.Scanner;
public class reverseString {
	private static Scanner inp;
	public static void main(String[] args) {
		inp = new Scanner(System.in);
		System.out.println("Enter your word:");
		String reverse = inp.nextLine();
		System.out.println(rev(reverse));
	}
   public static String rev(String str) {
	   String output = new String();
	   for(int i =(str.length()-1); i>=0; i--) {
		   output+=(str.charAt(i));
		   
	   }return output;
   }
}