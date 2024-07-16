package org.leet55;

public class Problem55 {

    public static void main(String[] args) {
        int[] nums = new int[] {8,7,6,5,4,3,2,1,0,0};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int steps = nums[0];
        if (nums.length == 1) {
            return true;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > steps) {
                steps = nums[i];
            }
            if (i == nums.length - 1) {
                return true;
            }
            if (steps <= 0) {
                return false;
            }
            steps--;
        }
        return true;
    }
}
