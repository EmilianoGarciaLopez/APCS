import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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
     * @param num
     * @param toBase
     * @return
     */
    public String intToStr(int num, int toBase) {
        String outputNum = "";
        while (num > 0) {
            outputNum = SYMBOLS.charAt(num % toBase) + outputNum;
            num /= toBase;
        }

        return outputNum.equals("") ? "0" : outputNum;
    }

    /**
     * Opens the file stream, inputs data one line at a time, converts, prints
     * the result to the console window and writes data to the output stream.
     */
    public void inputConvertPrintWrite() {
        Scanner in = null;
        PrintWriter pw = null;
        try {
            in = new Scanner(new File("Classwork/datafiles/values30.dat"));
            pw = new PrintWriter(new FileWriter("Classwork/datafiles/converted.dat"));
            String[] line;
            while (in.hasNext()) {
                line = in.nextLine().split("\t");
                if (Integer.parseInt(line[1]) < 2 || Integer.parseInt(line[1]) > 16) {
                    System.out.println("Invalid input base " + line[1]);
                } else if (Integer.parseInt(line[2]) < 2 || Integer.parseInt(line[2]) > 16) {
                    System.out.println("Invalid output base " + line[2]);
                } else {
                    System.out.println(line[0] + "\t" + line[1] + "\t" +
                            intToStr(strToInt(line[0], line[1]), Integer.parseInt(line[2])) + "\t" + line[2]);
                    pw.println(line[0] + "\t" + line[1] + "\t" +
                            intToStr(strToInt(line[0], line[1]), Integer.parseInt(line[2])) + "\t" + line[2]);


                }

            }
            in.close();
            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * Convert a String num in fromBase to base-10 int.
     * @param num,      a String representing the original value
     * @param fromBase, a String TODO
     * @return result, which is num converted to base 10
     */
    public int strToInt(String num, String fromBase) {
        int base = Integer.parseInt(fromBase);
        int result = 0;
        int exponent = num.length() - 1;

        for (char chr : num.toCharArray()) { //starts with largest value and works down
            int number = SYMBOLS.indexOf(chr);
            result += (int) (number * Math.pow(base, exponent));
            exponent--;
        }

        return result; //works

    }


}
