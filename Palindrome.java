
public class Palindrome {
	
	 public static boolean checkPalindrome(String input) {
	     if (input == null || input.length() == 0) {
	         return false;
	     }
	     String reverse = "";
	     int length = input.length();

	     for (int i = length - 1; i >= 0; i--) {
	         reverse +=input.charAt(i);
	     }

	     if (input.equals(reverse.toLowerCase())) {
	         System.out.println(input + " is palindrome");
	     } else {
	         System.out.println(input + " is not palindrome");
	     }
	         return false;
	 }

	 public static void main(String[] args) {
	     checkPalindrome("madam");
	     checkPalindrome("abcba");
	     checkPalindrome("123");
	  }
	}
