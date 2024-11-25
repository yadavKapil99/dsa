package Array;

public class stocks {

    public static int profit(int prices[]) {
        if (prices.length == 0) return 0;

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);

            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 2, 8, 3, 1, 5, 3, 6, 4};

        int result = profit(prices);
        System.out.println("The maximum profit is : " + result);
    }
}
