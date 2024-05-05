package java_237_Delete_Node_in_a_Linked_List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void deleteNode() {
        ListNode head = new ListNode(1);
        ListNode l1  = new ListNode(2);
        head.next = l1;
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        solution.deleteNode(l1);
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}