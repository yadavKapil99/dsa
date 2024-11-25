package Array;

public class MaxSubArraySum_PrefixSum {
    public static int Max(int num[]){
        int n = num.length;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[n];

        prefix[0] = num[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

                // Update max if the current sum is greater
                if(max < sum) max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -5, 3};
        int maxSum = Max(numbers);

        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}
