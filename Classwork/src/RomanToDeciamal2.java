/** This program ingests a roman numeral
 * and changes it to a base 10 number
 * This lab is due Tuesday, November 6
 */

public class RomanToDeciamal2 {


    public class romanAssign {
        int value(char s)
        {
            if (s == 'I')
                return 1;
            if (s== 'V')
                return 5;
            if (s == 'X')
                return 10;
            if (s == 'L')
                return 50;
            if (s == 'C')
                return 100;
            if (s == 'D')
                return 500;
            if (s == 'M')
                return 1000;
            return -1;
        }

    }

    public static void main(String[] args) {
        System.out.println("Input: CXIX => output: " + romanToDecimal("cxix".toUpperCase()));

    }
}
