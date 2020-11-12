import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This program calculates a user's BMI from their height and weight
 *
 * @author emilianogarcia
 * @version 1
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
    public static double computeBMI(int inches, int pounds) {
        double meters = inches * 0.0254;
        double kgs = 0.454 * pounds;
        if (meters <= 0 || kgs <= 0)
            return 0.0;
        else {
            return kgs / Math.pow(meters, 2);
        }
    }

    /**
     * Main method for class BMI calculator
     * Uses a Scanner to prompt the user for info, process the
     * feet/inches conversion, calls the computeBMI method and prints the
     * correct information.
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
                    System.out.println("Your BMI, expressed as weight(kg)/height(m)^2: " + df.format(computeBMI(intHeight, intWeight)) + " kg/m^2");
                    in.nextLine();

                } else if (textHeight.toUpperCase().equals("Q")) {
                    break;
                } else {
                    System.out.println("TODO invalid");
                }

            } catch (Exception e) {
                if (textHeight.toUpperCase().equals("Q"))
                    break;

                else {
                    System.out.println("TODO invalid, more details");
                    System.out.println(e);
                    if (e instanceof java.util.InputMismatchException)
                        in.nextLine();
                }


            }

        }

    }
}
