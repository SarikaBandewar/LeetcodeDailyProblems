package java_2816_Double_a_Number_Represented_as_a_LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void doubleIt() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(9);

        ListNode result = solution.doubleIt(head);
        StringBuffer sb = new StringBuffer();
        while (result != null) {
            sb.append(result.val);
            result = result.next;
        }
        Assertions.assertEquals("378", sb.toString());
    }
}