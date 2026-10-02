package practice.leetcode.problems.p0380insertdeletegetrandomo1;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {

    @Test
    void insertAndRemoveBasic() {
        RandomizedSet set = new RandomizedSet();

        assertTrue(set.insert(1));
        assertFalse(set.insert(1));

        assertTrue(set.remove(1));
        assertFalse(set.remove(1));

        assertTrue(set.insert(1));
        assertTrue(set.insert(2));
        assertTrue(set.insert(3));
        assertTrue(set.remove(2));
        assertFalse(set.remove(2));
    }

    @Test
    void getRandomReturnsOnlyExistingElements() {
        RandomizedSet set = new RandomizedSet();
        Set<Integer> expected = new HashSet<>();

        for (int i = -50; i < 50; i++) {
            assertTrue(set.insert(i));
            expected.add(i);
        }

        for (int i = 0; i < 1000; i++) {
            int value = set.getRandom();
            assertTrue(
                    expected.contains(value),
                    "getRandom вернул элемент, которого нет в множестве: " + value
            );
        }
    }

    @Test
    void removedElementIsNeverReturned() {
        RandomizedSet set = new RandomizedSet();
        Set<Integer> expected = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            set.insert(i);
            expected.add(i);
        }

        int removed = 42;
        assertTrue(set.remove(removed));
        expected.remove(removed);

        for (int i = 0; i < 1000; i++) {
            int value = set.getRandom();
            assertNotEquals(removed, value);
            assertTrue(expected.contains(value));
        }
    }

    @Test
    void insertAfterRemoveWorks() {
        RandomizedSet set = new RandomizedSet();

        assertTrue(set.insert(10));
        assertTrue(set.remove(10));
        assertFalse(set.remove(10));
        assertTrue(set.insert(10));

        for (int i = 0; i < 100; i++) {
            assertEquals(10, set.getRandom());
        }
    }

    @Test
    void randomOperationsMatchHashSet() {
        RandomizedSet set = new RandomizedSet();
        Set<Integer> reference = new HashSet<>();
        Random random = new Random(12345);

        for (int step = 0; step < 20_000; step++) {
            int value = random.nextInt(500) - 250;
            int op = random.nextInt(3);

            if (op == 0) {
                boolean actual = set.insert(value);
                boolean expected = reference.add(value);

                assertEquals(
                        expected,
                        actual,
                        "insert(" + value + ") на шаге " + step
                );
            } else if (op == 1) {
                boolean actual = set.remove(value);
                boolean expected = reference.remove(value);

                assertEquals(
                        expected,
                        actual,
                        "remove(" + value + ") на шаге " + step
                );
            } else if (!reference.isEmpty()) {
                int actual = set.getRandom();

                assertTrue(
                        reference.contains(actual),
                        "getRandom() вернул " + actual + ", которого нет в reference"
                );
            }
        }
    }
}