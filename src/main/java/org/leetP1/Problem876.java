package org.leetP1;

class ListNode876 {
    int val;
    ListNode876 next;
    ListNode876() {

    }
    ListNode876(int val) {
        this.val = val;
    }
    ListNode876(int val, ListNode876 next) {
        this.val = val;
        this.next = next;
    }
}

public class Problem876 {
    public static void main(String[] args) {
        middleNode(null);
    }

    public static ListNode876 middleNode(ListNode876 head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        while (slow.next != null) {
//            if (fast.next == null) {
//                return slow;
//            }
//            if (fast.next.next == null) {
//                return slow.next;
//            }
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
        ListNode876 slow = head;
        ListNode876 fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
