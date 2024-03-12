package org.leetP1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Problem1750 {
    public static void main(String[] args) {
        System.out.println(minimumLength("aabccabba"));
    }

    public static int minimumLength(String s) {
        char[] sArr = s.toCharArray();
        int a = 0;
        int z = s.length() - 1;
        char currChar;
        while (a < z) {
            if (sArr[a] != sArr[z]) {
                break;
            }
            currChar = sArr[a];
            while (a <= z && currChar == sArr[a]) {
                a++;
            }
            while (a <= z && currChar == sArr[z]) {
                z--;
            }
        }
        return z - a + 1;
    }
}
