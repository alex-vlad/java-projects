
public class PigLatin {
	private static String pigLatin ="";
	public static void main(String[] args) {
		String str ="java is Cool";
		String[] strarray= str.split(" ");
		for(String word:strarray) {
			char[] c = word.toLowerCase().toCharArray();
			//If the first letter from the word is a vowel AND the word is longer than or equal to 2 letters
			//the first letter of the word moved to the back of the word and append "way"
			if((c[0] == 'a' || c[0] == 'e' || c[0] == 'i' || c[0] == 'o' || c[0] == 'u' ) && word.length() > 1){
				pigLatin += " " + word.substring(1) + "-" + c[0]+"way";
			} else if( word.length() > 1){
				//If the first letter from the word is NOT vowel AND the word is longer than or equal to 2 letters
				//the first letter of the word moved to the back of the word and append "way"
				pigLatin += " " + word.substring(1) + "-" + c[0]+"ay";
			} else {
				//If the word exists only of one letter then add way to the end of the word
				pigLatin += " " + word + "-" + "way";
		}
		
	}System.out.println(pigLatin);
}
}
