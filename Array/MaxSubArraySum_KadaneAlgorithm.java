package Array;

public class MaxSubArraySum_KadaneAlgorithm {

    public static int kadane(int num[]){
        int n = num.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            currentSum += num[i];
            if(currentSum<0) currentSum=0;
            if(maxSum<currentSum) maxSum = currentSum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers [] = {-2,-3,4,-1,-2,1,5,-3};
        
        int result = kadane(numbers);
        System.out.println("Maximum Sum by Kadane Algorithm is :"+result);
    }
}
