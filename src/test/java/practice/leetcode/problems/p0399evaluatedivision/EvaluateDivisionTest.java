package practice.leetcode.problems.p0399evaluatedivision;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EvaluateDivisionTest {
    private EvaluateDivision solution = new EvaluateDivision();

    @Test
    void example1() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(List.of("a", "b"));
        equations.add(List.of("b", "c"));

        double[] values = new double[]{2.0, 3.0};

        List<List<String>> queries = new ArrayList<>();
        queries.add(List.of("a", "c"));
        queries.add(List.of("b", "a"));
        queries.add(List.of("a", "e"));
        queries.add(List.of("a", "a"));
        queries.add(List.of("x", "x"));

        double[] expected = new double[]{6.00000, 0.50000, -1.00000, 1.00000, -1.00000};

        assertArrayEquals(expected, solution.calcEquation(equations, values, queries));
    }

    @Test
    void example2() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(List.of("a", "b"));
        equations.add(List.of("b", "c"));
        equations.add(List.of("bc", "cd"));

        double[] values = new double[]{1.5, 2.5, 5.0};

        List<List<String>> queries = new ArrayList<>();
        queries.add(List.of("a", "c"));
        queries.add(List.of("c", "b"));
        queries.add(List.of("bc", "cd"));
        queries.add(List.of("cd", "bc"));

        double[] expected = new double[]{3.75000, 0.40000, 5.00000, 0.20000};

        assertArrayEquals(expected, solution.calcEquation(equations, values, queries));
    }

    @Test
    void example3() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(List.of("a", "b"));

        double[] values = new double[]{0.5};

        List<List<String>> queries = new ArrayList<>();
        queries.add(List.of("a", "b"));
        queries.add(List.of("b", "a"));
        queries.add(List.of("a", "c"));
        queries.add(List.of("x", "y"));

        double[] expected = new double[]{0.50000, 2.00000, -1.00000, -1.00000};

        assertArrayEquals(expected, solution.calcEquation(equations, values, queries));
    }
}
