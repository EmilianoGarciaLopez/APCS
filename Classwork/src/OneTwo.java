import java.util.Scanner;

public class OneTwo {
    public static void printLine(int line) {
        switch (line) {
            case 1:
            case 2:
                System.out.println("buckle my shoe");
                break;
            case 3:
            case 4:
                System.out.println("close the door");
                break;
            case 5:
            case 6:
                System.out.println("Pick up sticks");
                break;
            case 7:
            case 8:
                System.out.println("Don't be late");
                break;
            case 9:
            case 10:
                System.out.println("Do it again");
                break;
            default:
                System.out.println("not accessible");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter a number from 1-10 (or 0 to quit): ");
            try {
                num = in.nextInt();
                if (num == 0)
                    break;
                printLine(num);
            } catch (Exception e) {
                System.out.println("Error detail: " + e.toString());
                in.nextLine();
            }
        }
        System.out.println("Bye");
    }


}
