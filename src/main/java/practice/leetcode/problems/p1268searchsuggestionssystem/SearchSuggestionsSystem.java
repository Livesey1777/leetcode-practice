package practice.leetcode.problems.p1268searchsuggestionssystem;

import java.util.ArrayList;
import java.util.List;

public class SearchSuggestionsSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> suggestions = new ArrayList<>();
        Trie trie = new Trie();
        for (String product : products) trie.insert(product);
        for (int i = 1; i <= searchWord.length(); i++) {
            String prefix = searchWord.substring(0, i);
            suggestions.add(trie.wordsWithPrefix(prefix, 3));
        }
        return suggestions;
    }

    public static class Trie {
        private static class Node {
            Node[] children = new Node[26];
            boolean isWord;
        }

        private final Node root = new Node();

        public void insert(String word) {
            Node curr = root;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                if (curr.children[idx] == null) {
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }
            curr.isWord = true;
        }

        public List<String> wordsWithPrefix(String prefix, int limit) {
            Node node = findNode(prefix);
            List<String> suggestions = new ArrayList<>();
            if (node == null) return suggestions;
            collect(node, new StringBuilder(prefix), suggestions, limit);
            return suggestions;
        }

        private Node findNode(String word) {
            Node curr = root;
            for (char c : word.toCharArray()) {
                curr = curr.children[c - 'a'];
                if (curr == null) return null;
            }
            return curr;
        }

        private void collect(Node node, StringBuilder path, List<String> out, int limit) {
            if (out.size() == limit) return;
            if (node.isWord) out.add(path.toString());
            if (out.size() == limit) return;
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null) {
                    path.append((char) ('a' + i));
                    collect(node.children[i], path, out, limit);
                    path.deleteCharAt(path.length() - 1);
                    if (out.size() == limit) return;
                }
            }
        }
    }
}
