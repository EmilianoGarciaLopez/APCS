import java.io.File;
import java.util.Scanner;

/**
 * ISBNValidator validates data files of ISBN numbers using a few specific parameters
 *
 * @author emili
 * @version 01/15/2021
 */

public class ISBNValidator {
    private final String[] validNums;
    private final String[] invalidNums;


    /**
     * simple constructor; initializes arrays
     */
    public ISBNValidator() {
        validNums = new String[1500];
        invalidNums = new String[500];
    }


    /**
     * imports .dat file, calls isValidISBN method and stores
     * Strings into corresponding arrays
     */
    public void importData() {
        Scanner in = null;
        try {
            in = new Scanner(new File("Classwork/isbn_files/isbn1.dat")); //your path is different
            //TODO: JFile chooser

            int valid = 0, invalid = 0;

            while (in.hasNext()) {
                String isbn = in.nextLine();
                if (isValidISBN(isbn)) {
                    validNums[valid++] = isbn;
                } else {
                    invalidNums[invalid++] = isbn;
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    /**
     * determines validity of supplied ISBN number; called inside importData
     *
     * @param isbn A string representing an ISBN number
     * @return true if isbn is valid
     */
    public boolean isValidISBN(String isbn) {
        isbn = isbn.replace("-", "");

        int prefix = Integer.parseInt(isbn.substring(0, 3)); //substring does not read 3rd index

        if (prefix != 978 && prefix != 979) {
            return false;

        } else {
            int digitSum = 0;
            for (int i = 0; i < isbn.length(); i++) {
                if (i % 2 == 0) digitSum += Integer.parseInt("" + isbn.charAt(i));

                else digitSum += 3 * Integer.parseInt("" + isbn.charAt(i));
            }
            return digitSum % 10 == 0;
        }
    }


    /**
     * output the user-picked ISBN list or quit the application
     */
    public void runProgram() {
        Scanner ui = new Scanner(System.in);
        while (true) { //although you mentioned loop was not necessary during class, requirements said otherwise
            System.out.println("All ISBN data has been imported and validated. Would you like to:");
            System.out.println("\t1) View all valid ISBN numbers");
            System.out.println("\t2) View all invalid ISBN numbers");
            System.out.println("\t3) Quit");
            System.out.print("Your selection: ");
            String user = ui.nextLine();

            if (user.equals("1")) {
                for (String num : validNums) {
                    if (num != null) //absence of a memory address
                        System.out.println(num);
                }
            } else if (user.equals("2")) {
                for (String num : invalidNums) {
                    if (num != null) //absence of a memory address
                        System.out.println(num);
                }
            } else if (user.equals("3")) {
                ui.close();
                break;
            }
        }
    }

    /**
     * Main entry point for ISBN validator
     *
     * @param args command line arguments, if needed
     */
    public static void main(String[] args) {
        ISBNValidator app = new ISBNValidator();
        System.out.println("* ISBN Validator Program *");
        System.out.println("...Importing data...");
        app.importData(); // imports data from the text file
        app.runProgram(); // runs using a while loop; see examples
        System.out.println("* End of Program *");
    }
}