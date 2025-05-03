package Array2d;

public class Practise2 {

    public static int sumOfRow2(int matrix[][]){
        int sum = 0;

        int col = 0;
        
        while(col < matrix[0].length ){
            sum += matrix[1][col];
            col++;
        }

        return sum ;
    }
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

        int result = sumOfRow2(nums);

        System.out.println(result);
    }
}
