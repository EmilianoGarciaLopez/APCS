/** This program ingests a roman numeral
 * and changes it to a base 10 number
 * This lab is due Tuesday, November 6
 */

public class RomanToDecimal {
    // no private data, only helper methods
    /**
     * converts a string to a valid decimal (base-10 value)
     * @param roman Must be an uppercase string
     * @return
     */

    public static int romanToDecimal(String roman)  {
        int sum = 0;
        for (int i = 0; i< roman.length(); i++) {
            String letter = roman.substring(i, i+1);
            if(letter.equals("I"))
                sum += 1;
            else if (letter.equals("V")) // change to arrays
                sum += 5;
            else if (letter.equals("X"))
                sum += 10;
            else if (letter.equals("L"))
                sum += 50;
            else if (letter.equals("C"))
                sum += 100;
            else if (letter.equals("D"))
                sum += 500;
            else if (letter.equals("M"))
                sum += 1000;
            else return -1;
        }

        //how to handle invariants
        if(roman.indexOf("IV") != -1 || roman.indexOf("IX") != -1)
        sum -= 2;

        else if(roman.indexOf("XL") != -1 || roman.indexOf("XC") != -1)
            sum -= 20;

        else if(roman.indexOf("CD") != -1 || roman.indexOf("CM") != -1)
            sum -= 200;
    }

    public static void main(String[] args)   {
        for (String roman : args)   {
            int decimal = romanToDecimal(roman.toUpperCase());
            System.out.print("Input: "+roman+" ==> Output: ");
            if(decimal == -1)
                System.out.println("invalid");
            else    {
                if (decimalToRoman(decimal).equals(roman.toUpperCase())) {
                    System.out.println(System.out.println(romanToDecimal(roman.toUpperCase())));
                }
                else    {
                    System.out.println("invalid Roman numeral");
                }
            }
        }

    }

}
