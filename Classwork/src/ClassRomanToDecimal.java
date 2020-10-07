/** This program ingests a roman numeral
 * and changes it to a base 10 number
 * This lab is due Tuesday, November 6
 */

public class ClassRomanToDecimal {
    // no private data, only helper methods
    /**
     * converts a string to a valid decimal (base-10 value)
     * @param classroman Must be an uppercase string
     * @return
     */

    public static int classRomanToDecimal(String classroman)  {
        int sum = 0;
        for (int i = 0; i< classroman.length(); i++) {
            String letter = classroman.substring(i, i+1);
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
        if(classroman.indexOf("IV") != -1 || classroman.indexOf("IX") != -1)
            sum -= 2;

        else if(classroman.indexOf("XL") != -1 || classroman.indexOf("XC") != -1)
            sum -= 20;

        else if(classroman.indexOf("CD") != -1 || classroman.indexOf("CM") != -1)
            sum -= 200;
        return sum;
    }

    public static void main(String[] args)   {
        for (String roman : args)   {
            int decimal = classRomanToDecimal(roman.toUpperCase());
            System.out.print("Input: "+roman+" ==> Output: ");
            if(decimal == -1)
                System.out.println("invalid");
            else
                System.out.println(decimal);
        }

    }

}
