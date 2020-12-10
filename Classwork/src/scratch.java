public class scratch {

    public static void main(String[] args) {
        // 1 System.out.println("C:\\dictionaries\\words.txt");

        //2
        //return ((testString.charAt(testString.length() - 1)=='*') && !(testString.equals("")));

        //2b
        //return ((testString.charAt(testString.length() - 2)== "**") && testString.length >=4);

        System.out.println(convert("05/31/2019"));

    }

    //3
    public static String removeDashes(String str) {
        str.replace("-", "");
        return str;
    }

    //4b
    public static String convert(String dateStr) {

        String[] newStr = dateStr.split("/");

        String day = newStr[1];
        String month = newStr[0];
        String year = newStr[2];

        return (day + "-" + month + "-" + year);
    }

}
