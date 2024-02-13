package Recursion;

public class skip_StringOrChar_fromString {
    public static void main(String[] args) {
        skip(" " , "abcdaa");
        System.out.println(skip("abcdaa"));
        System.out.println(skipApple("abcAppledaa"));
        System.out.println(skip_App_When_NotApple("abcAppldaa"));
    }
    static void skip(String P , String UP) {
        if (UP.isEmpty()){
            System.out.println(P);
           return;
    }
        char ch = UP.charAt(0);
        if(ch == 'a')
            skip(P, UP.substring(1));
        else skip(P + ch, UP.substring(1));
    }

    static String skip( String UP) {
        if (UP.isEmpty()){
            return " ";
        }
        char ch = UP.charAt(0);
        if(ch == 'a')
            return skip( UP.substring(1));
        else return ch+ skip(UP.substring(1));
    }
    static String skipApple( String UP) {
        if (UP.isEmpty()){
            return " ";
        }

        if(UP.startsWith("Apple"))
            return skipApple( UP.substring(5));
        else return UP.charAt(0)+ skipApple(UP.substring(1));
    }
    static String skip_App_When_NotApple( String UP) {
        if (UP.isEmpty()){
            return " ";
        }

        if(UP.startsWith("App") && !UP.startsWith("Apple"))
            return skip_App_When_NotApple( UP.substring(3));
        else return UP.charAt(0)+ skip_App_When_NotApple(UP.substring(1));
    }
}
