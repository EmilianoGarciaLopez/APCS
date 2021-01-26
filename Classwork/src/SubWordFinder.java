import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class SubWordFinder implements WordFinder {
    private final ArrayList<ArrayList<String>> dictionary;
    public String alpha;

    public SubWordFinder() {
        alpha = "abcdefghijklmnopqrstuvwxyz";
        dictionary = new ArrayList<>(26);

        for (int i = 0; i < alpha.length(); i++) {
            dictionary.add(new ArrayList<String>());
        }
    }

    /**
     * Populates the dictionary from the text file contents
     * The dictionary object should contain 26 buckets, each
     * bucket filled with an ArrayList<String>
     * The String objects in the buckets are sorted A-Z because
     * of the nature of the text file words.txt
     */
    @Override
    public void populateDictionary() {
        Scanner in;
        try {
            in = new Scanner(new File("Classwork/subwords/words_all_os.txt"));
            String word;
            while (in.hasNext()) {
                word = in.nextLine();
                dictionary.get(alpha.indexOf(word.charAt(0))).add(word);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Retrieve all SubWord objects from the dictionary.
     * A SubWord is defined as a word that can be split into two
     * words that are also found in the dictionary.  The words
     * MUST be split evenly, e.g. no unused characters.
     * For example, "baseball" is a SubWord because it contains
     * "base" and "ball" (no unused characters)
     * To do this, you must look through every word in the dictionary
     * to see if it is a SubWord object
     *
     * @return An ArrayList containing the SubWord objects
     * pulled from the file words.txt
     */
    @Override
    public ArrayList<SubWord> getSubWords() {
        return null;
    }

    /**
     * Look through the entire dictionary object to see if
     * word exists in dictionary
     *
     * @param word The item to be searched for in dictionary
     * @return true if word is in dictionary, false otherwise
     * NOTE: EFFICIENCY O(log N) vs O(N) IS A BIG DEAL HERE!!!
     * You MAY NOT use Collections.binarySearch() here; you must use
     * YOUR OWN DEFINITION of a binary search in order to receive
     * the credit as specified on the grading rubric.
     */
    @Override
    public boolean inDictionary(String word) {
        return false;
    }
}
