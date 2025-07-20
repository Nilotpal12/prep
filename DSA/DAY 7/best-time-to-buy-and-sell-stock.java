class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, cp = Integer.MAX_VALUE;

        for(int price:prices){

            if(price<cp)    cp = price;
            else    profit = Math.max(profit, price-cp);
        }

        return profit;
    }
}