package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        int value = 121;

        int count = 0;

        Arrays.sort(coins, Comparator.reverseOrder());

        for (int i = 0; i < coins.length; i++) {
            if (value >= coins[i]) {            
                while (value >= coins[i]) {
                    count++;
                    value -= coins[i];
                }
            }
        }

        System.out.println("Total Count : "+count);
    }
}
