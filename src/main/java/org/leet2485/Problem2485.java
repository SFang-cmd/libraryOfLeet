package org.leet2485;

public class Problem2485 {
    public static void main(String[] args) {
        System.out.println(pivotInteger(1));
    }

    public static int pivotInteger(int n) {
        int lSum = 0;
        int rSum = 0;
        int lPoint = 1;
        int rPoint = n;
        while (lPoint < n || rPoint > 0) {
            if (lPoint == rPoint && lSum == rSum) {
                return lPoint;
            }
            if (lSum <= rSum) {
                lSum += lPoint;
                lPoint++;
            } else {
                rSum += rPoint;
                rPoint--;
            }
        }
        return -1;
    }
}
