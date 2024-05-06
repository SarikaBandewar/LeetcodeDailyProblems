package java_2487_Remove_Nodes_From_LinkedList;

import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void removeNodes() {
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(8);
        head = solution.removeNodes(head);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}