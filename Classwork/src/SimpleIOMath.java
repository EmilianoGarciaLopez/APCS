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
        System.out.println("This is promptUser");
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

    /**
     * Print the user's information
      */
    public void printInfo(){
        System.out.println("This is printInfo");
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is: " + name);
        System.out.println();

    }

    /**
     * Main method for class SimpleIOMath
     * @param args Command line arguments if needed
     */
    public static void main(String[] args) {
        SimpleIOMath obj  = new SimpleIOMath();
        obj.promptUser();

    }
}