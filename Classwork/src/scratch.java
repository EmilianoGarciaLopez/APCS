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
        str = str.replace("-", "");   //regex = "regular expression"
        return str;
    }

    //4b
    public static String convert(String dateStr) {

        String[] newStr = dateStr.split("/");
        for (int i = 0; i < 2; i++) {
            if (newStr[i].length() < 2) {
                newStr[i] = "0" + newStr[i];
            }
        }
        return (newStr[1] + "-" + newStr[0] + "-" + newStr[2]);
    }

    //6 - scroll method
    public static String scroll(String phrase) {
        if (phrase.length() > 0) {
            return phrase.substring(1) + phrase.charAt(0);
        } else {
            return phrase;
        }
    }

    //9 - use scroll method
    public static boolean confirm(String phrase) {
        if (phrase.length() > 1) {
            return (phrase.substring(1) + phrase.charAt(0)).equals(phrase);
        } else {
            return true;
        }
    }



}