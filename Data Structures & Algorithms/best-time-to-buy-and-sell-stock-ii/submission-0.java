class Solution {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int n = prices.length;
        int i = 0;

        while (i < n - 1) {

            // Find valley
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }

            int buy = prices[i];

            // Find peak
            while (i < n - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }

            int sell = prices[i];

            profit += sell - buy;
        }

        return profit;
    }
}