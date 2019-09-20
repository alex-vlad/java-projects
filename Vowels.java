// Enter a string and the program counts the number of vowels in the text. For added complexity have it report a sum of each vowel found.
public class Vowels {
	public static void main(String[] args) {
	String str="jAva is coOl";
	System.out.print(vow(str.toLowerCase()));
}
	public static int vow(String str) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			if (str.charAt(i)=='a'||
					str.charAt(i)=='e'||
					str.charAt(i)=='i'||
					str.charAt(i)=='o'||
					str.charAt(i)=='u'){
				count++;
			}
		}return count;
			
	}

}
