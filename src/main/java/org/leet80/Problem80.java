package org.leet80;

public class Problem80 {

    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        int freq = 1;
        int last = -10001;
        int currInd = 0;
        for (int num : nums) {
            if (last != num) {
                freq = 1;
                last = num;
                nums[currInd] = num;
                currInd++;
            } else if (last == num && freq < 2) {
                freq++;
                nums[currInd] = num;
                currInd++;
            }
        }
        return currInd;
    }
}
