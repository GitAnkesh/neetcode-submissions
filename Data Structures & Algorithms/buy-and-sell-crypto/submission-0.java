class Solution {
    public int maxProfit(int[] prices) {
        //buytime selltime profit currentProfit
        int maxProfit =0;
        int buy =prices[0];
        for(int i =0;i<prices.length;i++){
            int currentProfit=prices[i]-buy;
            if(prices[i]<buy){
                buy= prices[i];
            }
            maxProfit = Math.max(maxProfit,currentProfit);
        }
        return maxProfit;
    }
}
