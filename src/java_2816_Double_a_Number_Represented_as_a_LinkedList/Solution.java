package java_2816_Double_a_Number_Represented_as_a_LinkedList;

/**
 * Definition for singly-linked list. */
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {
    public ListNode doubleIt(ListNode head) {
        if (getCarry(head) == 1) {
            return new ListNode(1, head);
        }
        return head;
    }

    int getCarry(ListNode node) {
        int val = node.val * 2;
        if (node.next != null)
            val += getCarry(node.next);
        node.val = val %10;
        return val/10;
    }
}
