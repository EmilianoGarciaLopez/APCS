import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//TODO javadoc

public class ScrabbleScorer {

    private final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    ArrayList<String> dictionary;

    public ScrabbleScorer() {
        dictionary = new ArrayList<>();
        buildDictionary();
    }

    public static void main(String[] args) {
        ScrabbleScorer app = new ScrabbleScorer();
        //TODO -- you do this
    }

    public void buildDictionary() {
        Scanner in = null;
        try {
            in = new Scanner(new File("/Classwork/datafiles/SCRABBLE_WORDS.txt"));
            while (in.hasNext()) {
                dictionary.add(in.nextLine());
            }
            in.close();
            Collections.sort(dictionary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isValidWord(String word) {
        return Collections.binarySearch(dictionary, word) >= 0;
    }

    public int getWordScore(String word) {
        //TODO -- you implement this
        return 0;
    }

}
