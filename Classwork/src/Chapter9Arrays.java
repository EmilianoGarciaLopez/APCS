public class Chapter9Arrays {
    public static void main(String[] args) {


        //1a
        int[] intArr = {1, 2, 4};

        //1b
        int sum = intArr[0] + intArr[1];

    }

    /* 2
    false
    true
    true
    false
     */

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
    // The mystery count method counts the number of items in the array before a non-zero value is found.


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

    //  return i == j || i + j == N-1

    //14

    public static double positiveMax(double[][] m) {
        double MAX = 0;
        for(double[] row: m) {
            for(double element: row) {
                if(element > MAX) {
                    MAX = element;
                }
            }
        }
        return MAX;
    }

    //18

    //21
    /*

    {"One", "Two", "Three"}
    For-each loops with objects are strange, they don't modify the original
    array contents. Use a counter-driven loop and address array subsets by
    index to permanently change array

     */

    //22

    //23

}
