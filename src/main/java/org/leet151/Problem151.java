package org.leet151;

public class Problem151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        StringBuilder sentence = new StringBuilder();
        String[] org = s.split(" +", 0);
        for (int i = org.length - 1; i >= 0; i--) {
            sentence.append(org[i]);
            sentence.append(" ");
        }
        return sentence.toString().trim();
        /**
         * Extremely inefficient implementation, instead use built-in string split method above ^^
         */
        //        StringBuilder word = new StringBuilder();
//        StringBuilder sentence = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) == ' ') {
//                sentence.append(word.reverse());
//                if (!word.toString().trim().isEmpty()) {
//                    sentence.append(" ");
//                }
//                word.setLength(0);
//            } else {
//                word.append(s.charAt(i));
//            }
//        }
//        sentence.append(word.reverse().toString());
//        return sentence.toString().trim();
    }
}
