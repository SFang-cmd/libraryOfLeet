package org.leet2540;

public class Problem2540 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,6};
        int[] nums2 = new int[] {0,0,3,4,5};
        System.out.println(getCommon(nums1, nums2));
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int a = 0;
        int b = 0;
        int aLen = nums1.length;
        int bLen = nums2.length;
        while (a < aLen && b < bLen) {
            if (nums1[a] == nums2[b]) {
                return nums1[a];
            } else if (nums1[a] < nums2[b]) {
                a++;
            } else {
                b++;
            }
        }
        return -1;
    }
}
