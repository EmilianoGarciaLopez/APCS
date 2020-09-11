/**
 * HolyGrail.Java is the first lab i'll write. It is a simple UI program
 * that talks to the user
 * 09/15/2020
 * @author emilianogarcia
*/

/*
primatives (holdover from c/c++
int, double, boolean, char
Objects start with a capital letter
 */

// this imports a library when I compile this file+
import java.util.Scanner;


public class HolyGrail {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.nextLine();
        System.out.println("Hello "+name+", nice to meet you!");

        System.out.print("How old are you "+name+": ");
        int age = in.nextInt();

        System.out.print("How many pets do you own "+name+": ");
        int numpets = in.nextInt();

        System.out.println();
        System.out.println(name);
        System.out.println("You are " +age+ " years old.");
        System.out.println("you have " +numpets+ " pets");



    }
}

