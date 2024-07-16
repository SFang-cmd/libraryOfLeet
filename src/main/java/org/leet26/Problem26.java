package org.leet26;

import java.util.HashSet;

public class Problem26 {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
//        More elegant, problem-specific solution:
        int curr = 0;
        int last = -101;
        for (int num : nums) {
            if (last != num) {
                nums[curr] = num;
                last = num;
                curr++;
            }
        }
        return curr;

        /*
        General implementation that allows for non-ordered lists, not optimal for ordered lists
        --------
        HashSet<Integer> unique = new HashSet<>();
        int curr = 0;
        for (int num : nums) {
            if (!unique.contains(num)) {
                unique.add(num);
                nums[curr] = num;
                curr++;
            }
        }
        return curr;
        */
    }
}
