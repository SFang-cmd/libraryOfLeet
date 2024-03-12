package org.leet2;

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2() {}
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}

public class Problem2 {
    public static void main(String[] args) {
        ListNode2 l17 = new ListNode2(9);
        ListNode2 l16 = new ListNode2(9,l17);
        ListNode2 l15 = new ListNode2(9,l16);
        ListNode2 l14 = new ListNode2(9,l15);
        ListNode2 l13 = new ListNode2(9,l14);
        ListNode2 l12 = new ListNode2(9,l13);
        ListNode2 l11 = new ListNode2(9,l12);
        ListNode2 l24 = new ListNode2(9);
        ListNode2 l23 = new ListNode2(9,l24);
        ListNode2 l22 = new ListNode2(9,l23);
        ListNode2 l21 = new ListNode2(9,l22);

        ListNode2 sum = addTwoNumbers(l11, l21);
        while (sum != null) {
            System.out.println(sum.val);
            sum = sum.next;
        }
    }
    static ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        ListNode2 currL1 = l1;
        ListNode2 currL2 = l2;
        int sum = currL1.val + currL2.val;
        int carry = sum / 10;
        ListNode2 head = new ListNode2(sum % 10);
        ListNode2 prev = head;
        while (currL1.next != null || currL2.next != null) {
            currL1 = currL1.next != null ? currL1.next : new ListNode2(0);
            currL2 = currL2.next != null ? currL2.next : new ListNode2(0);
            sum = currL1.val + currL2.val + carry;
            prev.next = new ListNode2(sum % 10);
            carry = sum / 10;
            prev = prev.next;
        }
        if (carry > 0) {
            prev.next = new ListNode2(carry);
        }
        return head;
    }
}