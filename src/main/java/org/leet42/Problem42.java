package org.leet42;

public class Problem42 {

    public static void main(String[] args) {
        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int start = 0;
        int curr = 1;
        int currHeight = 0;
        int water = 0;
        int tempWater = 0;
        int minus = 0;
        while (start != height.length - 1 && (start != height.length - 2 || height[start] <= height[height.length - 1])) {
            currHeight = height[start] - minus;
            while (curr != height.length && height[curr] < currHeight) {
                tempWater += currHeight - height[curr];
                curr++;
            }
            if (curr != height.length) {
                water += tempWater;
                start = curr;
                curr++;
                minus = 0;
            } else {
                minus++;
                curr = start + 1;
            }
            tempWater = 0;
        }
        return water;
    }
}
