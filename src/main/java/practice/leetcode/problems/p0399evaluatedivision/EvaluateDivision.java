package practice.leetcode.problems.p0399evaluatedivision;

import java.util.*;

public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        double[] result = new double[queries.size()];
        int i = 0;
        for (List<String> equation : equations) {
            String from = equation.get(0);
            String to = equation.get(1);
            double value = values[i++];

            if (!graph.containsKey(from)) {
                graph.put(from, new HashMap<>());
            }
            graph.get(from).put(to, value);

            if (!graph.containsKey(to)) {
                graph.put(to, new HashMap<>());
            }
            graph.get(to).put(from, 1.0 / value);
        }

        int j = 0;
        for (List<String> query : queries) {
            String from = query.get(0);
            String to = query.get(1);
            if (!graph.containsKey(from) || !graph.containsKey(to)) {
                result[j++] = -1.0;
            } else {
                double product = 1.0;
                Set<String> visited = new HashSet<>();
                result[j++] = dfs(from, to, product, graph, visited);
            }
        }
        return result;
    }

    private double dfs(String current, String target, double product, Map<String, Map<String, Double>> graph, Set<String> visited) {
        if (current.equals(target)) {
            return product;
        }

        visited.add(current);
        for (Map.Entry<String, Double> entry : graph.get(current).entrySet()) {
            String neighbor = entry.getKey();
            Double weight = entry.getValue();
            if (!visited.contains(neighbor)) {
                double result = dfs(neighbor, target, weight * product, graph, visited );
                if (result != -1.0) {
                    return result;
                }
            }
        }
        return -1.0;
    }
}
