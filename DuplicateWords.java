import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class DuplicateWords {
	private static void duplicateWords(String str) {
        String[] words = str.toLowerCase().split(" ");
        // Creating one HashMap with words as key and their count as value
        Map < String, Integer > wordCount = new HashMap < String, Integer > ();
        // Checking each word
        for (String word: words) {
            if (wordCount.containsKey(word)) {
                // If it is present incrementing count by 1
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        // Extracting all keys of wordCount
        Set < String > wordsSet = wordCount.keySet();
        for (String word: wordsSet) {
            if (wordCount.get(word) > 1) {
                System.out.println(word + " : " + wordCount.get(word));
            }
        }
    }

    public static void main(String[] args) {

        duplicateWords("java java");
        duplicateWords("Java and java or java");
        duplicateWords("Super Man Bat Man Spider Man");
    }
}