
public class CountChars {
	public static void main(String[] args) {
		int count = countMatches("javajava",'j');
		System.out.println(count);
	}

	private static int countMatches(String str, char ch) {
	    if (str == null || str.length() == 0) {
	         return 0;
	    }
	    int count = 0;
	    for (int i = 0; i < str.length(); i++) {
	         if (ch == str.charAt(i)) {
	              count++;
	         }
	    }
	    return count;
	}
	
}