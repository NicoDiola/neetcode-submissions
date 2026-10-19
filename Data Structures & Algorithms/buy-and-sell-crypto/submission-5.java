class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int l = 0, r = 1;
        int profit = 0;

        while(r < prices.length){
            if(prices[l] < prices[r]){
                int tempProfit = prices[r] - prices[l];
                profit = Math.max(tempProfit, profit);
            }else {
                l = r;
            }
            r++;
        }

        return profit;
    }
}
