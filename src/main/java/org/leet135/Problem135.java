package org.leet135;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Problem135 {
    public static void main(String[] args) {
        int[] ratings = new int[]{1,3,4,5,2};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {
//        HashMap<Integer, ArrayList<Integer>> order = new HashMap<>();
//        int[] sort = ratings.clone();
//        int[] candies = new int[ratings.length];
//        int tot = 0;
//        for (int i = 0; i < ratings.length; i++) {
//            order.computeIfAbsent(ratings[i], k -> new ArrayList<>());
//            order.get(ratings[i]).add(i);
//        }
//        Arrays.sort(sort);
//        int curr;
//        for (int rating : sort) {
//            curr = order.get(rating).get(0);
//            order.get(rating).remove(0);
//            if (order.get(rating).isEmpty()) {
//                order.remove(rating);
//            }
//            candies[curr] = 1;
//            if (curr - 1 >= 0 && ratings[curr] > ratings[curr - 1]) {
//                candies[curr] = candies[curr - 1] + 1;
//            }
//            if (curr + 1 < ratings.length && ratings[curr] > ratings[curr + 1]) {
//                candies[curr] = Math.max(candies[curr], candies[curr + 1] + 1);
//            }
//            tot += candies[curr];
//        }
//        return tot;

        int[] candies = new int[ratings.length];
        candies[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            candies[i] = 1;
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        int sum = candies[ratings.length - 1];
        for (int j = ratings.length - 2; j >= 0; j--) {
            if (ratings[j] > ratings[j + 1] && candies[j] <= candies[j + 1]) {
                candies[j] = candies[j + 1] + 1;
            }
            sum += candies[j];
        }

        return sum;
    }
}
