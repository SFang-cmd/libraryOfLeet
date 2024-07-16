package org.leet274;

public class Problem274 {

    public static void main(String[] args) {
        int[] citations = new int[] {3,0,6,1,5};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        int[] count = new int[1001];
        for (int citation : citations) {
            count[citation]++;
        }
        int numPapers = 0;
        for (int j = 1000; j >= 0; j--) {
            numPapers += count[j];
            if (j <= numPapers) {
                return j;
            }
        }
        return 0;
    }
}
