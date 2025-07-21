package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50;

        // Step 1: Create ratio array
        double[][] ratio = new double[value.length][3];
        for (int j = 0; j < value.length; j++) {
            ratio[j][0] = value[j];                   // value
            ratio[j][1] = weight[j];                  // weight
            ratio[j][2] = (double) value[j] / weight[j]; // value/weight
        }

        // Step 2: Sort based on ratio (descending)
        Arrays.sort(ratio, Comparator.comparingDouble(a -> -a[2]));

        // Step 3: Add items to knapsack
        double totalValue = 0;
        for (int i = 0; i < ratio.length; i++) {
            if (capacity >= ratio[i][1]) {
                capacity -= ratio[i][1];
                totalValue += ratio[i][0];
            } else {
                totalValue += ratio[i][2] * capacity;
                break;
            }
        }

        System.out.println("Maximum value in Knapsack = " + totalValue);
    }
}
