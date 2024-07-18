package org.leet6;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println(convert("A", 1));
    }
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int charSpan = 2 * numRows - 2;
        int curr = 0;
        int diag = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                while (curr < s.length()) {
                    sb.append(s.charAt(curr));
                    curr += charSpan;
                }
            } else if (i < numRows - 1) {
                curr = i;
                diag = charSpan - i;
                while (curr < s.length() && diag < s.length()) {
                    sb.append(s.charAt(curr));
                    sb.append(s.charAt(diag));
                    curr += charSpan;
                    diag += charSpan;
                }
                if (curr < s.length()) {
                    sb.append(s.charAt(curr));
                }
            } else {
                curr = charSpan / 2;
                while (curr < s.length()) {
                    sb.append(s.charAt(curr));
                    curr += charSpan;
                }
            }
        }
        return sb.toString();
    }
}
