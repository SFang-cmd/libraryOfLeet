package org.leet525;

public class Problem525 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1};
        System.out.println(findMaxLength(nums));
    }

    public static int findMaxLength(int[] nums) {
        int[] pref = new int[nums.length + 1];
        int sum = 0;
        int maxLen = 0;
        pref[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + (nums[i] == 1 ? 1 : -1);
            pref[i + 1] = sum;
        }
        for (int j = 0; j < pref.length; j++) {
            for (int k = j; k < pref.length; k++) {
                if (pref[j] == pref[k] && (k - j) > maxLen) {
                    maxLen = k - j;
                }
            }
        }
        return maxLen;
    }
}
