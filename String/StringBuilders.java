package String;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i =0; i< 26; i++){
            char ch =(char)('a' + i);
            builder. append(ch);

        }
        System.out.println(" series of alphabet is " + builder.toString());
        builder.deleteCharAt(0);
        System.out.println(" delete a :   " + builder.toString());
        builder.reverse();
        System.out.println(" reversebui :   " + builder.toString());













    }
}
