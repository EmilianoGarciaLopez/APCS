import java.util.*;

/** This program ingests a roman numeral
 * and changes it to a base 10 number
 * This lab is due Tuesday, November 6
 */

public class ExtraRomanToDecimal(String roman2) {
    private Hashtable<Character, Integer> doutput;

    public ExtraRomanToDecimal()    {
        doutput = new Hashtable<>();
        doutput.put('i',1);
        doutput.put('x',10);
        doutput.put('c',100);
        doutput.put('m',1000);
        doutput.put('v',5);
        doutput.put('l',50);
        doutput.put('d',500);
    }

    public void romanAssign()    {

    }
    int romanToDec(String r) {
        int d = 0;
        for (int i = 0; i< r.length(); i++) {
            int r1 = doutput.get(r.charAt(i));

            if (i + 1 < r.length()) {
                int r2 = doutput.get(r.charAt(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println();

    }
}