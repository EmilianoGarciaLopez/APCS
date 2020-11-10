import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Javadoc this
 *
 * @author emilianogarcia
 */

public class BMICalculator {
    /**
     * Convert English to metric units, perform the BMI calculation.
     * NOTE: this method must properly handle bad data
     *
     * @param inches height;
     * @param pounds weight;
     * @return the user's BMI , expressed in weight/height^2
     */
    public static double copmuteBMI(int inches, int pounds) {
        double meters = inches / 39.3701;
        double kgs = 0.453592 * pounds;
        if (meters <= 0 || kgs <= 0)
            return 0.0;
        else {
            return kgs / Math.pow(meters, 2);
        }
    }

    /**
     * Main method for class BMI calculator
     *
     * @param args command line arguments, if needed
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String textHeight = "";
        int intHeight, intWeight;
        DecimalFormat df = new DecimalFormat("0.00");
        while (true) {
            try {
                System.out.print("Enter your height in feet and inches (Ex 6'1\") or \"Q\" to quit: ");
                textHeight = in.nextLine();
                int qtPos = textHeight.indexOf("'");
                int dblQtPos = textHeight.indexOf("\"");
                if (qtPos != -1 && dblQtPos != -1) {
                    intHeight = Integer.parseInt(textHeight.substring(0, qtPos)) * 12 +
                            Integer.parseInt(textHeight.substring((qtPos + 1), dblQtPos));
                    System.out.print("Enter your weight in pounds: ");
                    intWeight = in.nextInt();
                    System.out.println("TODO YOUR BMI..." + df.format(copmuteBMI(intHeight, intWeight)) + " Units");

                } else if (textHeight.toUpperCase().equals("Q")) {
                    break;
                } else {
                    System.out.println("TODO invalid");
                }
                in.nextLine();

            } catch (Exception e) {

                System.out.println("TODO invalid, more details");
                System.out.println(e);
                in.nextLine(); // flush the input


            }

        }

    }
}
