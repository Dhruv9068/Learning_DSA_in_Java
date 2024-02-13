package Arrays.com;

public class _3D_Array {
    public static void main(String[] args) {
        // Declare and initialize a 3D array with dimensions 2x3x4
        int[][][] threeDArray = new int[3][4][5];

        // Populate the 3D array with some values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threeDArray[i][j][k] = i * j * k;
                }
            }
        }

        // Print the 3D array as matrices with each "page" separated by space
        for (int i = 0; i < 3; i++) {
            System.out.println("Page " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println(); // Move to the next row in the matrix
            }
            System.out.println(); // Add space between matrices (pages)
        }
    }
    }

