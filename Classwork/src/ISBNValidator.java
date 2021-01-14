import java.io.File;
import java.util.Scanner;

/**
 * ISBNValidator validates data files of ISBN numbers using a few specific parameters
 * @version 01/15/2021
 * @author emili
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
     * imports .dat file, calls isValidISBN method and stores Strings into
     * corresponding arrays
     */
    public void importData() {
        Scanner in = null;

        try {
            in = new Scanner(new File("Classwork/isbn_files/isbn1.dat"));
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
        System.out.println("All ISBN data has been ... TODO");
        System.out.println("View all valid .... TODO");
        System.out.println(" View all invalid ... TODO");
        System.out.println("Quit ... TODO");
        Scanner ui = new Scanner(System.in);
        System.out.print("Your selection: ");
        String user = ui.nextLine();

        if (user.equals("1")) {
            for (String num : validNums) {
                if(num != null) //absence of a memory address
                    System.out.println(num);
            }
        }

        else if (user.equals("2")) {
            for (String num : invalidNums) {
                if(num != null) //absence of a memory address
                    System.out.println(num);
            }
        }
        ui.close();
    }

    /**
     * Main entry point for ISBN validator
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