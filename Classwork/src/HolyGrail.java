import java.util.Scanner;

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

// this imports a library when I compile this file
public class HolyGrail {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("* A chat with the bridge keeper *");
        System.out.println("Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.print("What is your quest? ");
        String quest = in.nextLine();
        System.out.print("What is your favorite color? ");
        String color = in.nextLine();
        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");
        System.out.println("Your name is: "+name);
        System.out.println("Your quest is: "+quest);
        System.out.println("Your favourite color is: "+color);
        System.out.println("* end of program *");

    }
}

/*
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.nextLine();
        System.out.println("Hello "+name+", nice to meet you!");

        System.out.print("How old are you "+name+": ");
        int age = in.nextInt();

        System.out.print("How many pets do you own "+name+": ");
        int numPets = in.nextInt();

        System.out.println();
        System.out.println(name+" great talking with you.");
        System.out.println("You are " +age+ " years old.");
        System.out.println("you have " +numPets+ " pets");

 */