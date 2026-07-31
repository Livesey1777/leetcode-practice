package practice.leetcode.problems.p2130maximumtwinsumofalinkedlist;

import org.junit.jupiter.api.Test;
import practice.leetcode.common.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static practice.leetcode.common.ListNodeUtils.listFromArray;

public class MaximumTwinSumOfALinkedListTest {
    private MaximumTwinSumOfALinkedList solution = new MaximumTwinSumOfALinkedList();

    @Test
    void example1() {
        ListNode head = listFromArray(new int[]{5, 4, 2, 1});
        int result = solution.pairSum(head);
        assertEquals(6, result);
    }

    @Test
    void example2() {
        ListNode head = listFromArray(new int[]{4, 2, 2, 3});
        int result = solution.pairSum(head);
        assertEquals(7, result);
    }

    @Test
    void example3() {
        ListNode head = listFromArray(new int[]
                {47, 22, 81, 46, 94, 95, 90, 22, 55, 91, 6, 83, 49, 65, 10, 32,
                        41, 26, 83, 99, 14, 85, 42, 99, 89, 69, 30, 92, 32, 74, 9, 81, 5, 9});
        int result = solution.pairSum(head);
        assertEquals(182, result);
    }

    @Test
    void example4() {
        ListNode head = listFromArray(new int[]{1, 100000});
        int result = solution.pairSum(head);
        assertEquals(100001, result);
    }

    @Test
    void example5() {
        ListNode head = listFromArray(new int[]
                {7, 57, 13, 31, 17, 65, 32, 3, 97, 22, 7, 20, 69, 35, 69, 75, 13, 33, 50, 80, 64, 71, 15, 28, 2, 27, 39, 48, 13, 22, 84, 5, 51, 46, 26, 78, 56, 63});
        int result = solution.pairSum(head);
        assertEquals(130, result);
    }
}
