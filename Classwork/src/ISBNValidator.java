import java.io.File;
import java.util.Scanner;

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
            in = new Scanner(new File("./Classwork/isbn_files/isbn1.dat"));
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
        String[] numArr = isbn.split("-");
        int[] nums = new int[numArr.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numArr[i]);
        }

        if (nums[0] == 978 || nums[0] == 979) {
            return false;
        } else {
            //TODO: build the check digit algorithm
        }

        return false;
    }


    /**
     * output the user-picked ISBN list or quit the application
     */
    public void runProgram() {

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
        app.importData(); // imports data from the text file app.runProgram();
        // runs using a while loop; see examples System.out.println("* End of Program *");
    }
}