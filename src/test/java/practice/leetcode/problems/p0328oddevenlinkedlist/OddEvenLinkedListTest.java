package practice.leetcode.problems.p0328oddevenlinkedlist;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.ListNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.leetcode.common.ListNodeUtils.listFromArray;
import static practice.leetcode.common.ListNodeUtils.listToArray;

public class OddEvenLinkedListTest {
    private OddEvenLinkedList solution = new OddEvenLinkedList();

    @Test
    void example1() {
        ListNode head = listFromArray(new int[]{1, 2, 3, 4, 5});
        ListNode result = solution.oddEvenList(head);
        List<Integer> expected = Arrays.asList(1, 3, 5, 2, 4);
        assertEquals(expected, listToArray(result));
    }

    @Test
    void example2() {
        ListNode head = listFromArray(new int[]{2, 1, 3, 5, 6, 4, 7});
        ListNode result = solution.oddEvenList(head);
        List<Integer> expected = Arrays.asList(2, 3, 6, 7, 1, 5, 4);
        assertEquals(expected, listToArray(result));
    }
}
