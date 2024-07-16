package org.leet27;

public class Problem27 {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3};
        int val = 3;
        removeElement(nums, val);
    }

    public static int removeElement(int[] nums, int val) {
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[curr] = nums[i];
                curr++;
            }
        }
        return curr;
    }
}
