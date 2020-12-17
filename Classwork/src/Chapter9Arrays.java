public class Chapter9Arrays {
    public static void main(String[] args) {


        //1
        int[] intArr = {1, 2, 4};

        //2
        int sum = intArr[0] + intArr[1];
    }

    //3
    public static void SwapArray(int[] array) {
        if (array.length > 1) {
            int f = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = f;
        } else {
            System.out.println("Invalid input");
        }
    }

    //4
    public static boolean testEqual(int[] array) {
        return array[0] == array[array.length - 1];
    }

    //5
    public static char getRandomRPS() {
        char[] rps = {'r', 'r', 'r', 'p', 'p', 'p', 'p', 'p', 's', 's', 's', 's', 's', 's'};
        int rnd = (int) (Math.random() * rps.length);
        return rps[rnd];

    }

    //6
    // The mystery count method counts the number of items in the array before a 0 is found.


    //11
    static int fib(int n) {         //https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
        int[] f = new int[n + 2];
        int i;


        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    //13

    //14

    //18

    //21

    //22

    //23

}
