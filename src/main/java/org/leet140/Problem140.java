package org.leet140;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem140 {
//    public List<String> wordBreak(String s, List<String> wordDict) {
//        trieNode root = createTrie(wordDict);
//
//    }

    private String combine(String s, trieNode curr, trieNode root) {
        char character = s.charAt(0);
        for (trieNode n : curr.nextChar) {
            if (n.val == character) {
                if (n.endWord) {
                    return n.val + " " + combine(s.substring(1), root, root);
                } else {
                    return n.val + " " + combine(s.substring(1), n, root);
                }
            }
        }
        return "";
    }

    private static trieNode createTrie(List<String> wordDict) {
        trieNode root = new trieNode();
        trieNode curr = root;
        trieNode next;
        char character;
        for (String word : wordDict) {
            for (int i = 0; i < word.length(); i++) {
                character = word.charAt(i);
                next = new trieNode(character);
                if (i == word.length() - 1) {
                    next.endWord = true;
                }
//                if (curr.nextChar.contains())
                curr.nextChar.add(next);
                curr = next;
            }
            curr = root;
        }
        return root;
    }

    public static void main(String[] args) {
        List<String> wordDict = Arrays.asList("apple","pen","applepen","pine","pineapple");
        trieNode root = createTrie(wordDict);
        System.out.println(5);
    }

    static class trieNode {
        char val;
        LinkedList<trieNode> nextChar;
        boolean endWord;

        trieNode() {
            nextChar = new LinkedList<>();
        }

        trieNode(char val) {
            this.val = val;
            nextChar = new LinkedList<>();
        }

//        @Override
//        private boolean isEqual();
    }
}
