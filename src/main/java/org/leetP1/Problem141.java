package org.leetP1;

class ListNode141 {
    int val;
    ListNode876 next;
    ListNode141(int x) {
        val = x;
        next = null;
    }
}

public class Problem141 {
    public static void main(String[] args) {
        ListNode876 l4 = new ListNode876(-4);
        ListNode876 l3 = new ListNode876(0);
        ListNode876 l2 = new ListNode876(2);
        ListNode876 head = new ListNode876(1);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = head;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode876 head) {
        if (head == null) return false;
        ListNode876 slow = head;
        ListNode876 fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

//        if (head == null) {
//            return false;
//        }
//        int currVal = head.val;
//        int listLength = 1;
//        int iter = listLength;
//        ListNode next = head.next;
//        while (next != null) {
//            ListNode compNode = head;
//            iter = listLength;
//            listLength = 1;
//            for (int i = 0; i < iter; i++) {
//                if (compNode == next) {
//                    return true;
//                } else {
//                    compNode = compNode.next;
//                    listLength++;
//                }
//            }
//            next = next.next;
//        }
//        return false;
    }
}
