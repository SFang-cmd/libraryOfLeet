package org.leet14;

public class Problem14 {
    public static void main(String[] args) {
//        String[] strs = new String[] {"ab", "a"};
        String[] strs = new String[] {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
//        String common = strs[0];
//        StringBuilder sb;
//        for (String s : strs) {
//            sb = new StringBuilder();
//            for (int i = 0; i < Math.min(common.length(), s.length()); i++) {
//                if (s.charAt(i) == common.charAt(i)) {
//                    sb.append(s.charAt(i));
//                } else {
//                    common = sb.toString();
//                }
//            }
//        }
//        return common;
//    }

        String common;
        StringBuilder sb;
        int min = Integer.MAX_VALUE;
        for (String s : strs) {
            min = Math.min(min, s.length());
        }

        common = strs[0].substring(0, min);

        for (String s : strs) {
            sb = new StringBuilder();
            for (int i = 0; i < min; i++) {
                if (s.charAt(i) != common.charAt(i)) {
                    min = i;
                    common = sb.toString();
                    break;
                }
                sb.append(common.charAt(i));
            }
        }
        return common;
    }
}
