package Array;

public class MaxSubArraySum {

    public static int  MaxSubArray(int num[]){
        int n = num.length;
        int i,j,k,max=Integer.MIN_VALUE;

        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                int sum =0;
                for(k=i;k<=j;k++){
                    // System.out.print(num[k]+" ");
                    sum += num[k];
                }
                if(max<sum) max = sum;
                // System.out.println();
            }
            // System.out.println();
        }
        return max;
    }

    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};

        int max = MaxSubArray(numbers);
        System.out.println("The maximum sum is :"+max);
    }
}
