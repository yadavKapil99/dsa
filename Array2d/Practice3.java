package Array2d;

public class Practice3 {

    public static void transpose(int matrix[][]) {
        int tRow = matrix[0].length;  
        int tCol = matrix.length;    

        int tMatrix[][] = new int[tRow][tCol];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                tMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < tMatrix.length; i++) {
            for (int j = 0; j < tMatrix[0].length; j++) {
                System.out.print(tMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        transpose(matrix);
    }
}
