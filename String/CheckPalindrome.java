package String;

public class CheckPalindrome {
    public static void main(String[] args) {
    String str = "Dhruv";
    String num = "121";
    String emp = "";
    String O = "uuvvuu";


    System.out.println(isPalindrome(str));
    System.out.println(isPalindrome_II_approach(num));
    System.out.println(isPalindrome_II_approach(O));
    System.out.println(isPalindrome(emp));
    }
    static boolean isPalindrome(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        str = str.toLowerCase();
        for(int i =0; i < str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if( start != end){
                return false;
            }
        }
        return true;
    }


    static boolean isPalindrome_II_approach(String s) {
        int left =0;
        int right = s.length()-1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
