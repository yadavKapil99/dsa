package Array2d;

import java.util.*;

public class Practise {

    public static int numberRepeated(int matrix[][] , int key){
        int result = 0;

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m;i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == key){
                    result++;
                }
            }
        }
        return result;
    }





    public static void main(String[] args) {

        int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };

        int key = 7;

        int result = numberRepeated(matrix, key);

        System.out.println(result);

    }
}
