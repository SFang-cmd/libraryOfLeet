package org.leet141;

class ListNode141 {
    int val;
    ListNode141 next;
    ListNode141(int x) {
        val = x;
        next = null;
    }
}

public class Problem141 {
    public static void main(String[] args) {
        ListNode141 l4 = new ListNode141(-4);
        ListNode141 l3 = new ListNode141(0);
        ListNode141 l2 = new ListNode141(2);
        ListNode141 head = new ListNode141(1);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = head;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode141 head) {
        if (head == null) return false;
        ListNode141 slow = head;
        ListNode141 fast = head;
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
