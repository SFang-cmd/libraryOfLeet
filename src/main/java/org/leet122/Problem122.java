package org.leet122;

public class Problem122 {

    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
//        int profit = 0;
//        int comp = 0;
//        int curr = 0;
//        int start = 0;
//        int max = 0;
//        for (int i = 0; i < prices.length; i++) {
//            curr = prices[i];
//            for (int j = start; j <= i; j++) {
//                comp = prices[i] - curr;
//                if (comp > max) {
//                    max = comp;
//                    start = i;
//                }
//            }
//            profit += max;
//            max = 0;
//        }
//        return profit;

        int max = 0;
        int curr = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > curr) {
                max = prices[i] - curr;
            } else {
                profit += max;
                max = 0;
                curr = prices[i];
            }
        }
        return profit;
    }
}
