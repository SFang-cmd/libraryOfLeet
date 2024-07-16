package org.leet189;

import java.util.Arrays;

public class Problem189 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }
        nums = Arrays.copyOf(temp, nums.length);
        System.out.println("hello");
        System.out.println("hello");
    }
}
