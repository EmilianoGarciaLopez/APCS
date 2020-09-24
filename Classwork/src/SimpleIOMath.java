import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * SimpleIOMath is a simple class that takes input/output from
 * a user,  stores  that information in class variables and then
 * defines a few helper methods
 * @version 09.24.2020
 * @author emilianog
 */

public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * Ask the user for information
     */
    public void promptUser(){
        Scanner s = new Scanner(System.in);
        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");
        System.out.print("Question 1: What is your name? ");
        name = s.nextLine();
        System.out.print("How old are you? ");
        age = s.nextInt();
        System.out.print("What is your favourite number? ");
        favNumber = s.nextInt();

    }

    private int smallestPrimeFactor(int age){
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61};
        for(int factor :primes) {
            if(age % factor == 0)
                return factor;
        }
        return age;

    }

    /**
     * Print the user's information
      */
    public void printInfo(){
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: "+ age);
        System.out.println("At your next birthday, you will turn " + (age+1));
        System.out.println("The first prime factor of "+age+" is: " + smallestPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + ((int) Math.pow(favNumber, 2)));
        System.out.println("The cosine of your favourite number is " + (Math.cos(favNumber)));
        System.out.println("* end of program *");

    }

    /**
     * Main method for class SimpleIOMath
     * @param args Command line arguments if needed
     */
    public static void main(String[] args) {
        SimpleIOMath obj  = new SimpleIOMath();
        obj.promptUser();
        System.out.println();
        System.out.println();
        obj.printInfo();

    }
}