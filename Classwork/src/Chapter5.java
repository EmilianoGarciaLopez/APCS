public class Chapter5 {
    public static void main(String[] args) {

        int n = 1234567;
        String x = Integer.toString(n);
        x = new StringBuilder(x).reverse().toString();
        n = Integer.parseInt(x);
        System.out.println(n);


    }
}


