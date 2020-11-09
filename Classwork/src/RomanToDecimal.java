import java.util.Hashtable;

/** This program ingests a roman numeral
 * and changes it to a base 10 number
 * This lab is due Tuesday, November 6
 */

// I could not find a place to utilize the indexOf(), or substring() methods

public class RomanToDecimal { // this is a public class that handles everything in this project
    /**
     * converts a string to a valid decimal (base-10 value)
     * @param roman Must be an uppercase string
     * @return this program returns d which is the decimal value
     */
    public static int romanToDecimal(String roman) {
        Hashtable<Character, Integer> doutput;
        doutput = new Hashtable<>(); //dictionary that contains corresponding values
        doutput.put('I',1); // for example I = 1
        doutput.put('X',10);
        doutput.put('C',100);
        doutput.put('M',1000);
        doutput.put('V',5);
        doutput.put('L',50);
        doutput.put('D',500);
        int d = 0; // initialize the decimal output with a value of 0
        for (int i = 0; i < roman.length(); i++) { // this traverses the string, a for loop
            if (doutput.containsKey(roman.charAt(i))) { //makes sure that index i of roman is valid input
                int r1 = doutput.get(roman.charAt(i)); // gets the value of index i from the hashtable

                if (i + 1 < roman.length()) { // checks i+1, and ensures no out of bounds error
                    if (doutput.containsKey(roman.charAt(i + 1))) { // makes sure that i+1 is valid input
                        int r2 = doutput.get(roman.charAt(i + 1));//gets value of i+1
                        if (r1 >= r2) {
                            d = d + r1;
                        } // if i is greater than i + 1  then i + (i+1) is added to the value
                        else {
                            d = (d + r2) - r1; // if it is lesser then i is taken from (i+1)
                            i++;
                        }
                    }
                    else {
                        d = -1;// catches invalid input and breaks for loop
                        break;
                    }
                }
                else {
                    d = d + r1; // if it is the end of the string only i matters
                    i++;
                }
            }

            else {
                d = -1;
                break;
            } //catches invalid input
        }
        return d;} // returns a decimal value as output


    public static void main(String[] args) { //main method that interacts with user and takes args
        for (String roman : args)   { //uses args as the roman string value
            int decimal = romanToDecimal(roman.toUpperCase()); //sets decimal equal to the output of romanToDecimal
            System.out.print("Input: "+roman+" ==> Output: ");
            if(decimal == -1) //checks if output is invalid
                System.out.println("invalid");
            else
                System.out.println(decimal);
        }
        System.out.println("My extra is that this program handles non-logical input such as 'ic'.");
    }}

    /* sources:
    https://www.geeksforgeeks.org/convert-a-roman-number-to-decimal-using-hashmap-in-java/
    https://www.geeksforgeeks.org/hashtable-in-java/
    https://www.geeksforgeeks.org/converting-roman-numerals-decimal-lying-1-3999/

     */
