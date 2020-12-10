public class scratch {

    public static void main(String[] args) {
        // 1 System.out.println("C:\\dictionaries\\words.txt");

        //2a
        //return s.length()>0 && s.charAt(s.length()-1) == '*';

        //2b
        //return s.length()>2 && s.charAt(s.length()-2) == "**";

        //4b System.out.println(convert("05/31/2019"));

    }

    //3
    public static String removeDashes(String str) {
        str.replace("-", "");
        return str;
    }

    //4b
    public static String convert(String dateStr) {

        String[] newStr = dateStr.split("/");

        return (newStr[1] + "-" + newStr[0] + "-" + newStr[2]);
    }

}
