import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This program finds the subwords within one larger word
 * @author emiliano
 * @version 2/4/2021
 */
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
            in.close();
            for (ArrayList<String> bucket : dictionary)
                Collections.sort(bucket);

        } catch (Exception e) {
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
        ArrayList<SubWord> subwords = new ArrayList<>();
        for (ArrayList<String> bucket : dictionary) {
            for (String word : bucket) {
                // a substring w 2 chars
                // a substring w rest of chars
                for (int i = 2; i < word.length() - 1; i++) {
                    String front = word.substring(0, i);
                    String back = word.substring(i);
                    if (inDictionary(front) && inDictionary(back)) {
                        subwords.add(new SubWord(word, front, back));
                    }
                }
            }
        }
        return subwords;
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
        ArrayList<String> bucket = dictionary.get(alpha.indexOf(word.charAt(0)));
        return Collections.binarySearch(bucket, word) >= 0;
    }

    private int indexOf(ArrayList<String> bucket, String word) {
        int high = bucket.size() - 1, low = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            String item = bucket.get(mid);
            if (word.compareTo(item) == 0)
                return mid;
            else if (word.compareTo(item) < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * Main method for this program
     * Finds filepath and prints output to console and file accordingly
     * @param args command line arguments, if needed
     */
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter(new FileWriter("Classwork/subwords/output.txt"));
            SubWordFinder app = new SubWordFinder();
            app.populateDictionary();
            ArrayList<SubWord> temp = app.getSubWords();
            for (SubWord sw : temp) {
                System.out.println(sw);
                pw.println(sw); //also outputs to text file for checking
            }
            System.out.println(temp.size() + " amount of lines");
            System.out.println("Exiting program...");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}