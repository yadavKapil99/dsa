package Array;

public class assignmentQ2 {

    public static int[][] sumIsZero(int nums[]) {
        int n = nums.length;
        int totalResult[][] = new int[n * n][3]; // Initialize with maximum possible pairs
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        totalResult[count][0] = nums[i];
                        totalResult[count][1] = nums[j];
                        totalResult[count][2] = nums[k];
                        count++;
                    }
                }
            }
        }

        // Trim the array to fit the exact number of results
        int[][] result = new int[count][3];
        for (int i = 0; i < count; i++) {
            result[i] = totalResult[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        int[][] results = sumIsZero(nums);

        for (int i = 0; i < results.length; i++) {
            System.out.println("[" + results[i][0] + ", " + results[i][1] + ", " + results[i][2] + "]");
        }
    }
}
