package practice.leetcode.problems.p0206reverselinkedlist;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.ListNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.leetcode.common.ListNodeUtils.listFromArray;
import static practice.leetcode.common.ListNodeUtils.listToArray;

public class ReverseLinkedListTest {
    private ReverseLinkedList solution = new ReverseLinkedList();

    @Test
    void example1() {
        ListNode head = listFromArray(new int[]{1, 2, 3, 4, 5});
        ListNode result = solution.reverseList(head);
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expected, listToArray(result));
    }

    @Test
    void example3() {
        ListNode head = listFromArray(new int[]{1, 2});
        ListNode result = solution.reverseList(head);
        List<Integer> expected = Arrays.asList(2, 1);
        assertEquals(expected, listToArray(result));
    }

    @Test
    void example4() {
        ListNode head = listFromArray(new int[]{});
        ListNode result = solution.reverseList(head);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, listToArray(result));
    }
}
