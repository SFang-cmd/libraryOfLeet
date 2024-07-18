package org.leet15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sol = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;
        int middle = 1;
        int sum;
//        int[] prev = new int[] {1,1,1};
        while (nums[left] <= 0 && left < nums.length - 2) {
            while (middle < right) {
                sum = nums[left] + nums[middle] + nums[right];
                if (sum == 0) {
                    sol.add(Arrays.asList(nums[left], nums[middle], nums[right]));
                    right = nums.length - 1;
                    do {
                        middle++;
                    } while (middle < right && nums[middle - 1] == nums[middle]);
                } else if (sum < 0) {
                    middle++;
                } else {
                    right--;
                }
            }
            right = nums.length - 1;
            do {
                left++;
                middle = left + 1;
            } while (left < nums.length - 2 &&
                    nums[left] <= 0 && nums[left - 1] == nums[left]);
        }
        return sol;
    }
}
