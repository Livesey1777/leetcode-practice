package practice.leetcode.problems.p2095deletethemiddlenodeofalinkedlist;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.ListNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.leetcode.common.ListNodeUtils.listFromArray;
import static practice.leetcode.common.ListNodeUtils.listToArray;

public class DeleteTheMiddleNodeOfALinkedListTest {
    private DeleteTheMiddleNodeOfALinkedList solution = new DeleteTheMiddleNodeOfALinkedList();

    @Test
    void example1() {
        ListNode head = listFromArray(new int[]{1, 3, 4, 7, 1, 2, 6});
        ListNode result = solution.deleteMiddle(head);
        List<Integer> expected = Arrays.asList(1, 3, 4, 1, 2, 6);
        assertEquals(expected, listToArray(result));
    }

    @Test
    void example2() {
        ListNode head = listFromArray(new int[]{1, 2, 3, 4});
        ListNode result = solution.deleteMiddle(head);
        List<Integer> expected = Arrays.asList(1, 2, 4);
        assertEquals(expected, listToArray(result));
    }

    @Test
    void example3() {
        ListNode head = listFromArray(new int[]{2, 1});
        ListNode result = solution.deleteMiddle(head);
        List<Integer> expected = Arrays.asList(2);
        assertEquals(expected, listToArray(result));
    }

    @Test
    void example4() {
        ListNode head = listFromArray(new int[]{1});
        ListNode result = solution.deleteMiddle(head);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, listToArray(result));
    }
}
