package Recursion;

public class RemoveCharectorFromString {
    public static void main(String[] args) {
        String UnProcessed = "chabbaaa";
        skip(" " , UnProcessed);
        System.out.println(skipWithReturn(UnProcessed));
    }
    static void skip(String Proccesed , String UnProcessed){
        if(UnProcessed.isEmpty()){
            System.out.println(Proccesed);
            return;
        }
        char ch = UnProcessed.charAt(0);

        if(ch == 'a')   skip(Proccesed , UnProcessed.substring(1));
        else skip(Proccesed + ch , UnProcessed.substring(1));

    }

    static String skipWithReturn( String UnProcessed){
        if(UnProcessed.isEmpty()){

            return " ";
        }
        char ch = UnProcessed.charAt(0);

        if(ch == 'a')   return skipWithReturn(UnProcessed.substring(1));
        else return ch + skipWithReturn(UnProcessed.substring(1));

    }
}
