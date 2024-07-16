package org.leet169;

import java.util.HashMap;

public class Problem169 {

    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            if (!numMap.containsKey(num)) {
                numMap.put(num, 1);
            } else {
                numMap.replace(num, numMap.get(num) + 1);
            }
            if (numMap.get(num) >  nums.length / 2) {
                return num;
            }
        }
        return 0;
    }
}
