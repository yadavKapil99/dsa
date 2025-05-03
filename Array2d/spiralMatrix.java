package Array2d;

import java.util.*;

public class spiralMatrix {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            // top
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // right
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }
            endColumn--;

            // bottom (only if there are more than one row)

            for (int j = endColumn; j >= startColumn; j--) {
                System.out.print(matrix[endRow][j] + " ");
            }
            endRow--;

            // left (only if there are more than one column)
            for (int i = endRow; i >= startRow; i--) {
                System.out.print(matrix[i][startColumn] + " ");
            }
            startColumn++;

        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiral(matrix);
    }
}
