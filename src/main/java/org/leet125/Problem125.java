package org.leet125;

public class Problem125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right) {
            if (!Character.isDigit(s.charAt(left)) &&
                    !Character.isLetter(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isDigit(s.charAt(right)) &&
                    !Character.isLetter(s.charAt(right))) {
                right--;
                continue;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
