package leetcode;

public class lc121 {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
    static int maxProfit(int[] prices) {
        int max_profit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buy < prices[i]){
                int temp = prices[i] - buy;
                max_profit = (temp > max_profit) ? temp : max_profit;
            } else {
                buy = prices[i];
            }
        }
        return max_profit;
    }
}
