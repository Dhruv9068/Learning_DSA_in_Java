package Arrays.com;

public class FloorOfTargetInSortedArr {
        public static void main(String[] args) {

            int[] C = {2, 3, 5, 9, 14, 16, 18};
            int target = 15;
            System.out.println(Ceiling(C, target));

            // Celing means smallest element in array greator or = target.

        }


        static int Ceiling(int[] C, int target) {
            int start = 0;
            int end = C.length - 1;


            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target == C[mid]) {
                    return mid;
                } else if (target > C[mid]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }

            }
            //the only change in finding floor if we dont find the number we return end instead of -1
            return end; }

    }

