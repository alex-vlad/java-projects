import java.util.Scanner;
public class reverseEachWord {
	private static Scanner inp;
	public static void main(String[] args) {
		inp = new Scanner(System.in);
		System.out.println("Enter your sentence:");
		String reverse = inp.nextLine();
		System.out.println(revEachWord(reverse));
	}
   public static String revEachWord(String originalStr) {
	        String[] words = originalStr.split(" ");
	        String reverseStr = "";
	        for (String word: words) {
	            reverseStr = reverseStr + rev(word) + " ";
	        } return reverseStr;
   }
   public static String rev(String str) {
	   String output = new String();
	   for(int i =(str.length()-1); i>=0; i--) {
		   output+=str.charAt(i);
	   }return output;
   }
}