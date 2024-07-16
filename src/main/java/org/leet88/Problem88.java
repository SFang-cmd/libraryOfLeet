package org.leet88;

public class Problem88 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int curr, pointer1, pointer2, num1, num2;
        pointer1 = m - 1;
        pointer2 = n - 1;
        curr = m + n - 1;
        while (!(pointer1 < 0 || pointer2 < 0)) {
            num1 = nums1[pointer1];
            num2 = nums2[pointer2];
            if (num1 > num2) {
                nums1[curr] = num1;
                pointer1--;
            } else {
                nums1[curr] = num2;
                pointer2--;
            }
            curr--;
        }
        if (pointer2 >= 0) {
            for (int i = pointer2; i >= 0; i--) {
                nums1[i] = nums2[i];
            }
        }
    }
}
