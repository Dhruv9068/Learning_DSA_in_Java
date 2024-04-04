package first_ideaprogram.src.Arrays.com;

public class Secondlargest {
    public static void main(String[] args) {
        int [] arr={ -1 ,-10,-20,-30,20,20,30,30,40,50,50,50,40,40,40};
        System.out.println(Secondlargestel(arr));
    }

    static int  Secondlargestel(int [] arr){
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
        }
        boolean foundSecondLargestel=false;
        int sl=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                sl = max;
                max = j;
                foundSecondLargestel = true;
            } else if (j > sl && j != max) {
                sl = j;
                foundSecondLargestel = true;
            }
            if (!foundSecondLargestel) {
                System.out.println("There is no secondlargest ele");
                return -1;
            }
        }

        return sl;
    }

}
