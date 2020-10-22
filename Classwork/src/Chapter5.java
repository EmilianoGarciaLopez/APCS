import java.util.Random;
public class Chapter5 {
    public static void main(String[] args) {
        //static -- a utility method, it just does something
        //non-static usually provides informaion about an object (getLastName)
        int a = -10 + (int)(Math.random()*21);  //-10 to 10
        int b = -10 + (int)(Math.random()*21);  //-10 to 10

        Random r = new Random();
        int c = -10 + r.nextInt(21);
        int d = 5, e = 22, f = -19; //only same type
        double x = 12, y = 26, z= 18; //auto promotion changes to 12.0
        final double PI = 3.14159; //PI is commonly stylized

        if (a == b)
            System.out.println("a equals b: "+a+" "+b);
        else
            System.out.println("a not equals b: "+a+" "+b);

        //STRINGS are NOT primatives; you can't compare using ==
        //Must compare using .equals or .compareTo
        String coolkid = "Sassan";
        String notcoolkid = new String("Sassan"); //Java tries to save memory unless specified by programmer
        if (coolkid.equals(notcoolkid)) //compares lexicographically
            System.out.println("true");
        else
            System.out.println("no compute");

        System.out.println(coolkid.charAt(0) == coolkid.charAt(2)); //S != s
        String doofus = null; //you can print null, but not an empty value
        System.out.println();
    }
}


