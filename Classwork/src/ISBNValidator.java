import java.util.Scanner;
public class ISBNValidator {
    private String[] validNums, invalidNums;


    /**
     * simple constructor; initializes arrays
     */
    public ISBNValidator() {

    }


    /**
     * imports .dat file, calls isValidISBN method and stores Strings into
     * corresponding arrays
     */
    public void importData() {

    }


    /**
     * determines validity of supplied ISBN number; called inside importData
     * @param isbn A string representing an ISBN number
     * @return true if isbn is valid
     */
    public boolean isValidISBN(String isbn) {
        //TODO: fix this
        return false;
    }


    /**
     * output the user-picked ISBN list or quit the application
     */
    public void runProgram() {

    }

    /**
     * Main entry point for ISBN validator
     * @param args command line arguments, if needed
     */
    public static void main(String[] args){
        ISBNValidator app = new ISBNValidator();
        System.out.println("* ISBN Validator Program *"); System.out.println("...Importing data...");
        app.importData(); // imports data from the text file app.runProgram();
        // runs using a while loop; see examples System.out.println("* End of Program *");
    }
}