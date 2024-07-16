package org.leet151;

public class Problem151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    public static String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder sentence = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                sentence.append(word.reverse().toString());
                word.setLength(0);
            } else {
                word.append(s.charAt(i));
            }
        }
        return sentence.toString();
    }
}
