package Arrays.com;

import java.util.Arrays;

public class SearchInSortedArray {
    public static void main(String[] args) {
int [][] arr = {
        {1,2,3},
        {4,5,6},
        {7,8,9},

};
System.out.println(Arrays.toString(search(arr,6)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        if (row == 1) {
return BinarySearch(matrix ,target, 0,0,column-1);
        }
        // run the loop till two rows are remaining

        int rStart=0;
        int rEnd = row -1;
        int cMid = column /2;
        while(rStart < (rEnd-1) ){ // true only if matrix have more than 2 columns
            int mid = rStart +(rEnd-rStart)/2;
            if(matrix[mid][cMid] ==  target){
                return new int []{ mid , cMid};
            }
            if(matrix[mid][cMid]  < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }

        }
        // now we have two rows remaining
        // check whether the target is the col of 2 rows
        if(matrix[rStart][cMid] ==  target){
            return new int []{ rStart , cMid};
        }
        if(matrix[rStart +1][cMid] ==  target){
            return new int []{ rStart +1 , cMid};
        }


        // search in 1st half
        if(target <= matrix[rStart][cMid-1]){
            return BinarySearch(matrix, target,rStart,0,cMid-1);
        }

        //search in 2nd half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][column-1]){
            return BinarySearch(matrix, target,rStart,cMid+1,column);
        }
        //search in 3rd half
        if(target <= matrix[rStart][cMid-1]){
            return BinarySearch(matrix, target,rStart+1,0,cMid-1);
        }

        // search in 4rth half

        else{
            return BinarySearch(matrix, target,rStart+1,cMid+1,column-1);
        }




    }


    // search in the row provided between the cols provided
    static int [] BinarySearch(int[][] bs, int target , int row, int Cstart , int Cend) {



        while (Cstart <= Cend) {
            int mid = Cstart + (Cend - Cstart) / 2;
            if (target == bs[row][mid]) {
                return new int [] {row , mid};
            }
            else if (target > bs[row][mid]) {
                Cstart = mid + 1;

            } else {
                Cend = mid - 1;
            }
        }


        return new int[]{-1,-1};

    }
}


//complexity (log(n) + log(m))