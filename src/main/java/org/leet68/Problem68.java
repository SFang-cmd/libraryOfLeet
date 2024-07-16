package org.leet68;

import java.util.ArrayList;
import java.util.List;

public class Problem68 {
    public static void main(String[] args) {
        String[] words = new String[] {"What","must","be","acknowledgment","shall","be"};
        List<String> s = fullJustify(words, 16);
        for (String str : s) {
            System.out.println(str.length());
        }
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        int currLine = 0;
        int currInd = 0;
        int start = 0;
        int numSpaces = 0;
        int spaceAmount = 0;
        int numExtra = 0;
        ArrayList<String> fin = new ArrayList<>();
        StringBuilder sb;
        while (currInd < words.length) {
            sb = new StringBuilder();
            currLine = words[currInd++].length();
            numSpaces = 0;
            while (currInd < words.length &&
                    currLine + numSpaces + words[currInd].length() < maxWidth) {
                currLine += words[currInd++].length();
                numSpaces++;
            }
            if (currInd == words.length) {
                spaceAmount = maxWidth - currLine - numSpaces;
                sb.append(words[start]);
                for (int i = 1; i <= numSpaces; i++) {
                    sb.append(" ");
                    sb.append(words[start + i]);
                }
                sb.append(" ".repeat(spaceAmount));
                fin.add(sb.toString());
                break;
            }
            if (numSpaces == 0) {
                sb.append(words[start]);
                sb.append(" ".repeat(maxWidth - currLine));
                start += numSpaces + 1;
                fin.add(sb.toString());
                continue;
            }
            spaceAmount = (maxWidth - currLine) / numSpaces;
            numExtra = (maxWidth - currLine) % numSpaces;
            sb.append(words[start]);
            for (int i = 1; i <= numSpaces; i++) {
                if (i <= numExtra) {
                    sb.append(" ".repeat(spaceAmount + 1));
                } else {
                    sb.append(" ".repeat(spaceAmount));
                }
                sb.append(words[start + i]);
            }
            fin.add(sb.toString());
            start += numSpaces + 1;
        }
        return fin;
    }
}
