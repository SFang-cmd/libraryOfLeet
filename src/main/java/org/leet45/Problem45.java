package org.leet45;

import java.util.LinkedList;
import java.util.Queue;

public class Problem45 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int near = 0;
        int far = 0;
        int steps = 0;
        while (far < nums.length - 1) {
            int farthest = 0;
            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, nums[i]);
            }
            near = far + 1;
            far += farthest;
            steps++;
        }
        return steps;
    }
}
