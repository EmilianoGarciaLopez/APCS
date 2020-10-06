import java.util.*;

/** This program ingests a roman numeral
 * and changes it to a base 10 number
 * This lab is due Tuesday, November 6
 */

public class RomanToDecimal {
    public static Hashtable<Character, Integer> doutput;
    public RomanToDecimal()    {
        doutput = new Hashtable<>(); //dictionary that contains corresponding values
        doutput.put('I',1);
        doutput.put('X',10);
        doutput.put('C',100);
        doutput.put('M',1000);
        doutput.put('V',5);
        doutput.put('L',50);
        doutput.put('D',500);
    }
    /**
     * converts a string to a valid decimal (base-10 value)
     * @param roman Must be an uppercase string
     * @return
     */
    public static int romanToDecimal(String roman) {
        int d = 0;
        for (int i = 0; i< roman.length(); i++) { // this traverses the string, a for loop
            if (doutput.containsKey(roman.charAt(i))){ //makes sure that index i of roman is valid input
                int r1 = doutput.get(roman.charAt(i)); // gets the value of index i from the hashtable

                if (i + 1 < roman.length()){ // checks i+1, and ensures no out of bounds error
                    if (doutput.containsKey(roman.charAt(i+1))) { // makes sure that i+1 is valid input
                        int r2 = doutput.get(roman.charAt(i + 1));//gets value of i+1
                        if (r1 >= r2){ d = d + r1;} // if i is greater than i + 1  then i + (i+1) is added to the value
                        else { d = (d +r2) -r1; i++;} } // if it is lesser then i is taken from (i+1)
                    else {d = -1; break; }} // catches invalid input
                else { d = d + r1; i++;}} // if it is the end of the string only i matters

            else {d = -1; break; } //catches invalid input
        }
        return d;}


    public static void main(String[] args) {
        RomanToDecimal ob = new RomanToDecimal();
        for (String r : args)   {
            int decimal = romanToDecimal(r.toUpperCase());
            System.out.print("Input: "+r+" ==> Output: ");
            if(decimal == -1)
                System.out.println("invalid");
            else
                System.out.println(decimal);
        }

    }}
