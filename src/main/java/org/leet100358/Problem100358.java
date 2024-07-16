package org.leet100358;

public class Problem100358 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,10,2};
        System.out.println(maximumLength(nums, 6));
    }

    public static int maximumLength(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] %= k;
        }

        int seq = 0;
        int count = 0;
        int countMax = 0;

        for (int ki = 0; ki < 2 * k; ki++) {
            for (int ki2 = 0; ki2 <  k; ki2++) {
                for (int num : nums) {
                    if (seq == 0) {
                        if (num == ki - ki2) {
                            count++;
                        }
                    } else {
                        if (num == ki2) {
                            count++;
                        }
                    }
                    seq++;
                    seq %= 2;
                }
                countMax = Math.max(countMax, count);
                count = 0;
            }
        }
        return countMax;
    }
}
