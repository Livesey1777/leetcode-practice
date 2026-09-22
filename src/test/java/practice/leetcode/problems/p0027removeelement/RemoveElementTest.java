package practice.leetcode.problems.p0027removeelement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    RemoveElement solution = new RemoveElement();

    @Test
    void example1() {
        int[] nums = {3, 2, 2, 3};

        int k = solution.removeElement(nums, 3);

        assertEquals(2, k);
        assertPrefixAnyOrder(nums, k, new int[]{2, 2});
    }

    @Test
    void example2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        int k = solution.removeElement(nums, 2);

        assertEquals(5, k);

        assertPrefixAnyOrder(nums, k, new int[]{0, 1, 4, 0, 3});
    }

        private static void assertPrefixAnyOrder(int[] actual, int k, int[] expected) {
        assertEquals(expected.length, k, "Неверная длина после удаления");

        int[] actualPrefix = Arrays.copyOf(actual, k);
        int[] expectedCopy = expected.clone();

        Arrays.sort(actualPrefix);
        Arrays.sort(expectedCopy);

        assertArrayEquals(
                expectedCopy,
                actualPrefix,
                "Первые " + k + " элементов не совпадают как множество"
        );
    }
}