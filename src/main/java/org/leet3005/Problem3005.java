package org.leet3005;

public class Problem3005 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }

    public static int maxFrequencyElements(int[] nums) {
        int maxNum = 0;
        for (int num : nums) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        int[] freqList = new int[maxNum + 1];
        for (int num2 : nums) {
            freqList[num2]++;
        }
        int maxFreq = 0;
        int maxSum = 0;
        for (int freq : freqList) {
            if (freq > maxFreq) {
                maxFreq = freq;
                maxSum = freq;
            } else if (freq == maxFreq) {
                maxSum += maxFreq;
            }
        }
        return maxSum;


//        HashMap<Integer, Integer> freqMap = new HashMap<>();
//        for (int num : nums) {
//            if (!freqMap.containsKey(num)) {
//                freqMap.put(num, 1);
//            } else {
//                freqMap.replace(num, freqMap.get(num) + 1);
//            }
//        }
//        int maxFreq = 0;
//        int maxSum = 0;
//        int currFreq = 0;
//        for (int freq : freqMap.keySet()) {
//            currFreq = freqMap.get(freq);
//            if (maxFreq < currFreq) {
//                maxFreq = freqMap.get(freq);
//                maxSum = maxFreq;
//            } else if (maxFreq == currFreq) {
//                maxSum += maxFreq;
//            }
//        }
//        return maxSum;
    }
}
