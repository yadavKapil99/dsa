package Array2d;

public class SearchedMatrixStairCase {

    public static boolean stairCaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        // Start from top-right corner of the matrix
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + ", " + col + ")");
                return true;
            } else if (matrix[row][col] < key) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        int key = 33;
        boolean found = stairCaseSearch(matrix, key);
        
        if (!found) {
            System.out.println("Key not found");
        }
    }
}
