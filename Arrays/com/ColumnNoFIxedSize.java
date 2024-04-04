package Arrays.com;

public class ColumnNoFIxedSize {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7},
                {8,9}
        };
System.out.println("Print non fixed column matrix logic");
        for(int row =0; row < arr.length; row++){
            for (int col =0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
