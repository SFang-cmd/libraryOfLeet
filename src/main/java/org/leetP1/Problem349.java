package org.leetP1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Problem349 {
    public static void main(String[] args) {

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        HashSet<Integer> inter = new HashSet<>();
        while (i < len1 && j < len2) {
            if (nums1[i] == nums2[j]) {
                inter.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int interSize = inter.size();
        Object[] interList = inter.toArray();
        int[] interArr = new int[interSize];
        for (int r = 0; r < interSize; r++) {
            interArr[r] = (int) interList[r];
        }
        return interArr;





//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int i = 0;
//        int j = 0;
//        int len1 = nums1.length;
//        int len2 = nums2.length;
//        int currInt = -1;
//        ArrayList<Integer> inter = new ArrayList<>();
//        while (i < len1 && j < len2) {
//            if (nums1[i] == nums2[j] && currInt != nums1[i]) {
//                inter.add(nums1[i]);
//                currInt = nums1[i];
//                i++;
//                j++;
//            } else if (nums1[i] > nums2[j]) {
//                j++;
//            } else {
//                i++;
//            }
//        }
//        int interSize = inter.size();
//        int[] interList = new int[interSize];
//        for (int r = 0; r < interSize; r++) {
//            interList[r] = inter.get(r);
//        }
//        return interList;
    }
}
