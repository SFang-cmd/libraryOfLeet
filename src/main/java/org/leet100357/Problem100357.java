package org.leet100357;

public class Problem100357 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,1,1,2,1,2};
        System.out.println(maximumLength(nums));
    }

    public static int maximumLength(int[] nums) {
        int bool = 0;
        int boolOpp = 1;
        int c = 0;
        int cOpp = 0;
        int cOdd = 0;
        int cEven = 0;
        for (int num : nums) {
            if (num % 2 == bool) {
                c++;
                bool = (bool + 1) % 2;
            }
            if (num % 2 == boolOpp) {
                cOpp++;
                boolOpp = (boolOpp + 1) % 2;
            }
            if (num % 2 == 0) {
                cEven++;
            }
            if (num % 2 == 1) {
                cOdd++;
            }
        }
        return Math.max(Math.max(Math.max(c, cOpp), cEven), cOdd);
    }
}
