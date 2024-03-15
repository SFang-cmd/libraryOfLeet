package org.leet238;

import java.util.Arrays;

public class Problem238 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] expected = {0,0,9,0,0};
        System.out.println(Arrays.equals(productExceptSelf(nums), expected));
    }
    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] tot = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tot[i] = product;
            product = nums[i] * product;
        }
        product = 1;
        for (int i = (nums.length - 1); i >= 0; i--) {
            tot[i] = tot[i] * product;
            product = nums[i] * product;
        }
        return tot;

//        int l = 1;
//        int r = 1;
//        int len = nums.length;
//        int[] lPref = new int[len];
//        int[] rPref = new int[len];
//        int[] tot = new int[len];
//        for (int i = 0; i < len; i++) {
//            l *= nums[i];
//            lPref[i] = l;
//            r *= nums[len - i - 1];
//            rPref[len - i - 1] = r;
//        }
//        tot[0] = rPref[1];
//        tot[len - 1] = lPref[len - 2];
//        for (int i = 1; i < len - 1; i++) {
//            tot[i] = lPref[i - 1] * rPref[i + 1];
//        }
//        return tot;
    }
}
