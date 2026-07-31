package practice.leetcode.problems.p2130maximumtwinsumofalinkedlist;

import practice.leetcode.common.ListNode;

public class MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        if (head == null) return 0;
        ListNode middle = findMiddle(head);
        ListNode secondHalf = middle.next;
        middle.next = null;
        ListNode reversedSecondHalf = reverse(secondHalf);
        int maxSum = 0;
        while (reversedSecondHalf != null) {
            maxSum = Math.max(maxSum, (head.val + reversedSecondHalf.val));
            head = head.next;
            reversedSecondHalf = reversedSecondHalf.next;
        }
        return maxSum;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next; // fast на один шаг вперёд
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
