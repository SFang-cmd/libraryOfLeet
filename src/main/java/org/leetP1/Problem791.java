package org.leetP1;

import java.util.Arrays;

public class Problem791 {
    public static void main(String[] args) {
        System.out.println(customSortString("abcdefg","cbda"));
    }

    public static String customSortString(String order, String s) {
        char[] ordList = order.toCharArray();
        if (ordList.length < 26) {
            char[] newOrdList = new char[26];
            int newChar = ordList.length;
            for (int m = 0; m < newChar; m++) {
                newOrdList[m] = ordList[m];
            }
            for (int l = 97; l < 123; l++) {
                if (!contains(ordList, (char) l)) {
                    newOrdList[newChar] = (char) l;
                    newChar++;
                }
            }
            ordList = newOrdList;
        }
        char[] sList = s.toCharArray();
        char[] freqList = new char[26];
        int sLen = sList.length;
        for (char character : sList) {
            freqList[character - 97]++;
        }
        char[] finList = new char[sLen];
        char currChar;
        int j = 0;
        for (int i = 0; i < 26; i++) {
            currChar = ordList[i];
            for (int k = 0; k < freqList[currChar - 97]; k++) {
                finList[j] = currChar;
                j++;
            }
        }
        return new String(finList);
    }

    public static boolean contains(char[] list, char elem) {
        for (char interest : list) {
            if (interest == elem) {
                return true;
            }
        }
        return false;
    }
}
