package practice.leetcode.problems.p0872leafsimilartrees;

import practice.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        collectLeafSequence(root1, list1);
        collectLeafSequence(root2, list2);

        return list1.equals(list2);
    }

    private void collectLeafSequence(TreeNode root, List<Integer> list) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            list.add(root.val);
        } else {
            collectLeafSequence(root.left, list);
            collectLeafSequence(root.right, list);
        }
    }
}
