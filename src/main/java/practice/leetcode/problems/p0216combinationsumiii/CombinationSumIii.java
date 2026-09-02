package practice.leetcode.problems.p0216combinationsumiii;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIii {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), k, n, 1);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> current, int k, int n, int start) {
        if (current.size() > k) {
            return;
        }
        if (current.size() == k && n == 0) {
            res.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < 10; i++) {
            if (i > n) break;
            current.add(i);
            backtrack(res, current, k, n - i, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
