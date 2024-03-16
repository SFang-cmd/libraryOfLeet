package org.leet525;

import java.util.HashMap;

public class Problem525 {
    public static void main(String[] args) {
//        int[] nums = new int[]{0,1,0,1,1,1,1,0,0,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0};
//        System.out.println(findMaxLength(nums));
        System.out.println(1 << 1);
        System.out.println(0 << 1);
    }

    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> valToInd = new HashMap<>(); // prefix sum, index
        int sum = 0;
        int maxLen = 0;
        valToInd.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum = sum + (nums[i] == 1 ? 1 : -1);
            if (valToInd.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - valToInd.get(sum)); // Taken from optimized sample code
            } else {
                valToInd.put(sum, i);
            }
        }
        return maxLen;
    }
}
