import java.util.*;

/** This program ingests a roman numeral
 * and changes it to a base 10 number
 * This lab is due Tuesday, November 6
 */

public class RomanToDecimal {
    public static Hashtable<Character, Integer> doutput;
    public RomanToDecimal()    {
        doutput = new Hashtable<>();
        doutput.put('i',1);
        doutput.put('x',10);
        doutput.put('c',100);
        doutput.put('m',1000);
        doutput.put('v',5);
        doutput.put('l',50);
        doutput.put('d',500);
    }
    /**
     * converts a string to a valid decimal (base-10 value)
     * @param r Must be a lowercase string
     * @return
     */
    public static int romanToDec(String r) {
        int d = 0;
        for (int i = 0; i< r.length(); i++) {
            if (doutput.containsKey(r.charAt(i))){
                int r1 = doutput.get(r.charAt(i));

                if (i + 1 < r.length()){
                    if (doutput.containsKey(r.charAt(i+1))) {
                        int r2 = doutput.get(r.charAt(i + 1));
                        if (r1 >= r2){ d = d + r1;}
                        else { d = (d +r2) -r1; i++;} }
                    else {d = -1; break; }}
                else { d = d + r1; i++;}}

            else {d = -1; break; }
        }
        return d;}


    public static void main(String[] args) {
        RomanToDecimal ob = new RomanToDecimal();
        for (String r : args)   {
            int decimal = romanToDec(r.toLowerCase());
            System.out.print("Input: "+r+" ==> Output: ");
            if(decimal == -1)
                System.out.println("invalid");
            else
                System.out.println(decimal);
        }

    }}
