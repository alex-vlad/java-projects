import java.util.Scanner;
/*Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.*/
public class CheckPassword {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Type your password:");
		String s = input.nextLine();
		if (Check(s.toUpperCase())) {
			System.out.println("Password is valid.");
		}else {
			System.out.println("Invalid password");
		}
		
	}
	public static boolean Check(String str) {
		if (str.length()<10) {
			return false;
		}
		int charCount=0;
		int numCount=0;
		for(int i =0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(is_numeric(ch)) {
				numCount++;
			}else if(is_letter(ch)) {
				charCount++;
			}else {
				return false;
			}
		}return (charCount>=5&&numCount>=2);
	}
	public static boolean is_numeric(char ch) {
		return(ch>='0' && ch<='9');
	}
	public static boolean is_letter(char ch) {
		return (ch>='A'&&ch<='Z');
	}

}
