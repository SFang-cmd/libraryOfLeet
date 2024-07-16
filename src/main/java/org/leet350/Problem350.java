package org.leet350;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem350 {

    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nFList = new HashMap<>();
        ArrayList<Integer> tot = new ArrayList<>();
        for (int num : nums1) {
            if (nFList.containsKey(num)) {
                nFList.put(num, nFList.get(num) + 1);
            } else {
                nFList.put(num, 1);
            }
        }

        for (int num : nums2) {
            if (nFList.containsKey(num)) {
                if (nFList.get(num) > 0) {
                    nFList.put(num, nFList.get(num) - 1);
                    tot.add(num);
                }
            }
        }
        int[] sol = new int[tot.size()];
        for (int i = 0; i < tot.size(); i++) {
            sol[i] = tot.get(i);
        }
        return sol;
    }
}