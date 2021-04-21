/**
 * RecursiveFunCTF ain't nothing but a fun and games thing.
 *
 * @version 02-14-2018
 * @author Julian Cochran
 */

import java.util.Scanner;

public class RecursiveFunCTF {

    /** This method is called map
     * @return a map
     */
    public static int[][] map() {
        int[][] map = new int[7][4];
        String zippy = "abcdefghijklmnopqrstuvwxyz !";
        int[] vals = new int[28];
        makeZippyZip(0, vals, zippy);
        int decryptor = vals.length % 97 - 1;
        for (int yen = 0; yen < map[0].length; yen++) {
            for (int yang = 0; yang < map.length; yang++) {
                map[yang][yen] = vals[decryptor--];
            }
        }
        System.out.println(vals);
        return map;
    }

    /** This method is called makeZippyZip
     * @param snoopy
     * @param things
     * @param zippy
     */
    public static void makeZippyZip(int snoopy, int[] things, String zippy) {
        if (zippy.length() > 0) {
            things[snoopy] = zippy.charAt(0);
            makeZippyZip(snoopy + 1, things, zippy.substring(1));
        }
    }

    /** This method is called process.
     * @param pwd
     * @return a string
     */
    public static String process(String pwd) {
        if (pwd.length() < 2)
            return pwd;
        else {
            int len = pwd.length() / 2;
            return pwd.charAt(len) + process(pwd.substring(len)) + process(pwd.substring(0, len));
        }
    }

    /** This method is called reportsAreTrue
     * @param thang a strang
     * @return true if thang is a strang, false otherwise
     */
    public static boolean reportsAreTrue(String thang) {
        String route = "622322226110506131223300";
        String builder = "";
        int[][] map = map();
        for (int i = 0; i < route.length(); i += 2)
            builder += Integer.toString(map[Integer.parseInt(route.substring(i, i + 1))][Integer.parseInt(route.substring(i + 1, i + 2))], 16).toUpperCase();
        System.out.println(process(builder));
        System.out.println(builder);
        return thang.equals(process(builder));
    }

    /** The entry point for the madness. Let's see how solid you are on early 1980's movie trivia.
     * @param args if needed
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userinput = "";
        System.out.println("** Welcome to the Mind-Bender **");

        userinput = "";
        do {
            System.out.print("WHEN THE BASICS ARE ON THE LINE, WHAT IS THE FIRST THING ANY PROGRAMMER MUST KNOW HOW TO SAY? ");
            userinput = in.nextLine();
            if (!reportsAreTrue(userinput)) {
                System.out.println("I AM SORRY, THAT IS INCORRECT. AGAIN:");
                try {
                    Thread.sleep(750);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            } else
                break;
        } while (true);
        System.out.println("FINE. ACCESS HAS BEEN GRANTED, TO PLAY, VISIT THE FOLLOWING URL: https://goo.gl/QbyTXf");
        System.out.println(map());
    }

}
