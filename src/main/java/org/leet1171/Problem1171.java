package org.leet1171;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Problem1171 {
    public static void main(String[] args) {
//        ListNode l17 = new ListNode(9);
//        ListNode l16 = new ListNode(9,l17);
        ListNode l15 = new ListNode(1);
        ListNode l14 = new ListNode(-3,l15);
        ListNode l13 = new ListNode(3,l14);
        ListNode l12 = new ListNode(2,l13);
        ListNode l11 = new ListNode(1,l12);

        System.out.println(removeZeroSumSublists(l11));
    }

    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode startHead = new ListNode();
        startHead.next = head;
        ListNode posHead = startHead;
        ListNode currHead;
        int sum;
        while (posHead.next != null) {
            sum = 0;
            currHead = posHead.next;
            while (currHead != null) {
                sum += currHead.val;
                if (sum == 0) {
                    posHead.next = currHead.next;
                }
                currHead = currHead.next;
            }
            if (posHead.next == null) {
                break;
            }
            posHead = posHead.next;
        }
        return startHead.next;


//        ListNode lastHead = new ListNode();
//        lastHead.next = head;
//        ListNode iter = head;
//        int sum = 0;
//        while (iter != null) {
//            sum += iter.val;
//            if (sum == 0) {
//                head = iter.next;
//                break;
//            }
//            iter = iter.next;
//        }
//        lastHead = head;
//        iter = head.next;
//        while (lastHead.next != null) {
//            while (iter != null) {
//                sum += iter.val;
//                if (sum == 0) {
//                    lastHead.next = iter.next;
//                }
//                iter = iter.next;
//            }
//            lastHead = lastHead.next;
//            iter = lastHead.next;
//        }
//        return head;
    }
}
