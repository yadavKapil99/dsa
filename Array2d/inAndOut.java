package Array2d;
import java.util.*;

public class inAndOut {

    public static void searchKey() {
        // Method logic goes here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter the matrix array entries: " + n + "x" + m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter element for matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Optional: Print the matrix to verify the input
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}



