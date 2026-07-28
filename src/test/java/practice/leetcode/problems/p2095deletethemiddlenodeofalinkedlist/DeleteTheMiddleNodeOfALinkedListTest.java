package practice.leetcode.problems.p2095deletethemiddlenodeofalinkedlist;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteTheMiddleNodeOfALinkedListTest {
    private DeleteTheMiddleNodeOfALinkedList solution = new DeleteTheMiddleNodeOfALinkedList();

    private ListNode listFromArray(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    private List<Integer> listToArray(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            result.add(head.val);
            head = head.next;
        }
        return result;
    }

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
