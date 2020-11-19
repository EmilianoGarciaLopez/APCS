import java.io.File;
import java.util.Scanner;

/**
 * This program is a base converter that reads a data file and outputs a converted file
 *
 * @author emiliano
 * @version 11/19/2020
 */
public class BaseConverter {

    final String SYMBOLS = "0123456789ABCDEF";

    /**
     * Constructor for class.
     */
    public BaseConverter() {

    }


    /**
     * Main method for class BaseConverter
     *
     * @param args, command line arguments, if needed
     */
    public static void main(String[] args) {
        BaseConverter app = new BaseConverter();
        app.inputConvertPrintWrite();
    }


    /**
     * Convert a base-10 int to a String number of base toBase.
     *
     * @param num
     * @param toBase
     * @return
     */
    public String intToStr(int num, int toBase) {
        return "";

    }

    /**
     * Opens the file stream, inputs data one line at a time, converts, prints
     * the result to the console window and writes data to the output stream.
     */
    public void inputConvertPrintWrite() {
        Scanner in = null;
        try {
            in = new Scanner(new File("Classwork/datafiles/values30.dat"));
            String[] line;
            while (in.hasNext()) {
                line = in.nextLine().split("\t");
                if (Integer.parseInt(line[1]) < 2 || Integer.parseInt(line[1]) > 16) {
                    System.out.println("Invalid input base " + "TODO");
                } else if (Integer.parseInt(line[2]) < 2 || Integer.parseInt(line[2]) > 16) {
                    System.out.println("invalid output base " + "TODO");
                } else {
                    System.out.println(line[0] + " base " + line[1] + " = " + "???" + " base " + line[2]);
                    // ["24A4B46", "13", "6"]
                    //System.out.println(in.nextLine());
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * Convert a String num in fromBase to base-10 int.
     *
     * @param num,      a String representing the original value
     * @param fromBase, a String TODO
     * @return result, which is num converted to base 10
     */
    public int strToInt(String num, String fromBase) {
        int base = Integer.parseInt(fromBase);
        int result = 0;
        int exponent = num.length() - 1;

        for (char ch : num.toCharArray()) { //starts with largest value and works down
            int number = SYMBOLS.indexOf(ch);
            result += (int) (number * Math.pow(base, exponent));
            exponent--;
        }

        return result; //works

    }


}
