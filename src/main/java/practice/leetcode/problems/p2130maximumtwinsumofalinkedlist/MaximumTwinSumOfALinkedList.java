package practice.leetcode.problems.p2130maximumtwinsumofalinkedlist;

import practice.leetcode.common.ListNode;

public class MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        if (head == null) return 0;
        ListNode middle = findMiddle(head);
        ListNode secondHalf = middle.next;
        middle.next = null;

        ListNode reversedSecondHalf = reverse(secondHalf);
        ListNode reversedHead = reversedSecondHalf;

        int maxSum = 0;
        ListNode curr1 = head;
        ListNode curr2 = reversedSecondHalf;
        while (curr2 != null) {
            maxSum = Math.max(maxSum, curr1.val + curr2.val);
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        middle.next = reverse(reversedHead);
        return maxSum;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
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
