package org.leet100340;

public class Problem100340 {

    public static void main(String[] args) {
        System.out.println(maxHeightOfTriangle(2,4));
        System.out.println(maxHeightOfTriangle(2,1));
        System.out.println(maxHeightOfTriangle(1,1));
        System.out.println(maxHeightOfTriangle(10,1));
        System.out.println(maxHeightOfTriangle(10,10));
    }

    public static int maxHeightOfTriangle(int red, int blue) {
        int l1 = 1;
        int r1 = red;
        int b1 = blue;
        while (r1 >= 0 && b1 >= 0) {
            if (l1 % 2 == 0) {
                r1 -= l1;
            } else {
                b1 -= l1;
            }
            l1++;
        }

        int l2 = 1;
        int r2 = red;
        int b2 = blue;

        while (r2 >= 0 && b2 >= 0) {
            if (l2 % 2 == 1) {
                r2 -= l2;
            } else {
                b2 -= l2;
            }
            l2++;
        }

        return Math.max(l1 - 2, l2 - 2);
    }
}
