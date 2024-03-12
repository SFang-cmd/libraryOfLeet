package org.leet948;

public class Problem948 {
    public static void main(String[] args) {
        int[] testList = new int[] {100,200,300,400};
        System.out.println(bagOfTokensScore(testList, 200));
    }

    public static int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int size = tokens.length;
        int maxVal = 0;
        int maxIndex = 0;
        int minVal = Integer.MAX_VALUE;
        int minIndex = 0;
        int maxScore = 0;
        while (size > 0) {
            maxVal = 0;
            maxIndex = 0;
            minVal = Integer.MAX_VALUE;
            minIndex = 0;
            for (int i = 0; i < tokens.length; i++) {
                if (maxVal < tokens[i]) {
                    maxIndex = i;
                    maxVal = tokens[i];
                }
                if (minVal > tokens[i] && tokens[i] != -1) {
                    minIndex = i;
                    minVal = tokens[i];
                }
            }
            if (power >= minVal) {
                power -= minVal;
                tokens[minIndex] = -1;
                score++;
            } else if (score >= 1) {
                power += maxVal;
                score--;
                tokens[maxIndex] = -1;
            }
            if (score > maxScore) {
                maxScore = score;
            }
            size--;
        }
        return maxScore;
    }
}
