package practice.leetcode.problems.p0841keysandrooms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeysAndRoomsTest {
    private KeysAndRooms solution = new KeysAndRooms();

    @Test
    void example1() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1));
        rooms.add(List.of(2));
        rooms.add(List.of(3));
        rooms.add(List.of());

        assertTrue(solution.canVisitAllRooms(rooms));
    }

    @Test
    void example2() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1, 3));
        rooms.add(List.of(3, 0, 1));
        rooms.add(List.of(2));
        rooms.add(List.of(0));

        assertFalse(solution.canVisitAllRooms(rooms));
    }
}
