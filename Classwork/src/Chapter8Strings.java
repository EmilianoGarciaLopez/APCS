public class Chapter8Strings {

    public static void main(String[] args) {
        /*String s1 = "hello";
        System.out.println(s1);
        s1 = s1.replace("l", "");
        System.out.println(s1);

        String names = ("Abby" + "Nathaniel" + "PJ" + "Kennedy" + "Skye" + "Gio");
        System.out.println(names);
        // unicode for String formatting -- 4 bytes
        System.out.println(names.length()*4 + " Bytes");
        names += "Chris" + "Charlotte"; //changes the memory register
        System.out.println(names); //pointer is represented by */

        String s1 = "Gio";  //literal string
        String s2 = "PJ";   //literal string
        String s3 = s2;
        String s4 = "Brian";
        String s5 = s4;

        System.out.println(s1 == s2);           //compares memory address [false]
        System.out.println(s1.equals(s2));      // [false]
        System.out.println(s2.equals(s3));      // [true]
        System.out.println(s2 == s3);           // [true]
        System.out.println(s4.equals(s5));      // [true]
        System.out.println(s4 == s5);            // [false]

        System.out.println(s1.compareTo(s2));   // compares ascii values
        System.out.println(s4.compareTo(s5));   // Brian == Brian


    }
}
