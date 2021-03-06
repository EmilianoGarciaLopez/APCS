import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This program asks for a word from the user and
 * outputs a corresponding score for that word
 *
 * @author Emiliano
 * @version 1.22.2021
 */
public class ScrabbleScorer {

    private final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    ArrayList<String> dictionary;

    /**
     * This method initializes the dictionary arrayList
     * and calls the buildDictionary() method
     */
    public ScrabbleScorer() {
        dictionary = new ArrayList<>();
        buildDictionary();
    }

    /**
     * This method builds the dictionary as an arrayList from the provided txt file
     */
    public void buildDictionary() {
        Scanner in;
        try {
            in = new Scanner(new File("Classwork/datafiles/SCRABBLE_WORDS.txt")); //your directory path is different
            while (in.hasNext()) {
                dictionary.add(in.nextLine());
            }
            in.close();
            Collections.sort(dictionary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method checks if a word provided by the user is real
     *
     * @param word a String provided by the user
     * @return a boolean value indicating if the supplied input is a real word
     */
    public boolean isValidWord(String word) {
        return (Collections.binarySearch(dictionary, word) >= 0);
    }

    /**
     * This method gives the appropriate point score for a user-provided word
     *
     * @param word a String provided by the user
     * @return score an Int containing the point total for the provided input
     */
    public int getWordScore(String word) {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += points[letters.indexOf(word.charAt(i))];
        }
        return score;
    }

    /**
     * main method that handles user interaction and input
     *
     * @param args command line arguments, if needed
     */
    public static void main(String[] args) {
        ScrabbleScorer app = new ScrabbleScorer();
        Scanner in = new Scanner(System.in);
        System.out.println("* Welcome to the Scrabble Word Scorer app *");

        while (true) {
            //TODO -- you do this
            System.out.print("Enter a word to score or 0 to quit:\t");
            String temp = in.nextLine();
            String input = temp.toUpperCase();

            if (input.equals("0")) {
                break;
            } else if (app.isValidWord(input)) {
                System.out.println(temp + " = " + app.getWordScore(input) + " points");
            } else {
                System.out.println(temp + " is not a valid word in the dictionary");
            }
        }
        System.out.println("Exiting the program thanks for playing");
    }

}
