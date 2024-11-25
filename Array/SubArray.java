package Array;

public class SubArray {

    public static void printSubArrays(int num[]){
        int length = num.length;

        int totalSubArrays =0;

        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){

                // print in the 3rd loop 
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println("");
                totalSubArrays +=1;
            }
        }

        System.out.println(totalSubArrays);
    }

    public static void main(String[] args) {
        int numbers [] = {2,4,9,13,23};
        printSubArrays(numbers);
    }
}
