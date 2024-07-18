package org.leet28;

public class Problem28 {
    public static void main(String[] args) {
        System.out.println(strStr("aaa", "aaaa"));
    }

    public static int strStr(String haystack, String needle) {
        int nInd = 0;
        int ind = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (haystack.charAt(i + ind) == needle.charAt(nInd)) {
                if (nInd == needle.length() - 1) {
                    return i;
                }
                if (i + ind == haystack.length() - 1) {
                    return -1;
                }
                nInd++;
                ind++;
            }
            nInd = 0;
            ind = 0;
        }
        return -1;
    }
}
