package practice.leetcode.problems.p0208implementtrieprefixtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    void leetcodeExample() {
        Trie trie = new Trie();

        trie.insert("apple");

        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));

        trie.insert("app");

        assertTrue(trie.search("app"));
    }

    @Test
    void oneCharacterWords() {
        Trie trie = new Trie();

        trie.insert("a");

        assertTrue(trie.search("a"));
        assertTrue(trie.startsWith("a"));

        assertFalse(trie.search("b"));
        assertFalse(trie.startsWith("b"));

        assertFalse(trie.search("aa"));
        assertFalse(trie.startsWith("aa"));
    }

    @Test
    void commonPrefixAndBranching() {
        Trie trie = new Trie();

        trie.insert("car");
        trie.insert("cart");
        trie.insert("cat");
        trie.insert("dog");

        assertTrue(trie.search("car"));
        assertTrue(trie.search("cart"));
        assertTrue(trie.search("cat"));
        assertTrue(trie.search("dog"));

        assertFalse(trie.search("ca"));
        assertFalse(trie.search("do"));
        assertFalse(trie.search("dodge"));

        assertTrue(trie.startsWith("ca"));
        assertTrue(trie.startsWith("car"));
        assertTrue(trie.startsWith("cart"));
        assertTrue(trie.startsWith("cat"));
        assertTrue(trie.startsWith("do"));
        assertTrue(trie.startsWith("dog"));
        assertFalse(trie.startsWith("dodge"));
    }

    @Test
    void wordCanBePrefixOfAnotherWord() {
        Trie trie = new Trie();

        trie.insert("app");
        trie.insert("apple");

        assertTrue(trie.search("app"));
        assertTrue(trie.search("apple"));

        assertTrue(trie.startsWith("app"));
        assertTrue(trie.startsWith("appl"));
        assertTrue(trie.startsWith("apple"));

        assertFalse(trie.search("appl"));
    }

    @Test
    void duplicateInsertion() {
        Trie trie = new Trie();

        trie.insert("hello");
        trie.insert("hello");

        assertTrue(trie.search("hello"));
        assertTrue(trie.startsWith("he"));
        assertTrue(trie.startsWith("hell"));

        assertFalse(trie.search("hell"));
    }

    @Test
    void missingWords() {
        Trie trie = new Trie();

        trie.insert("banana");

        assertFalse(trie.search("ban"));
        assertFalse(trie.search("banan"));
        assertFalse(trie.search("bananaa"));
        assertFalse(trie.startsWith("bananana"));

        assertTrue(trie.search("banana"));
        assertTrue(trie.startsWith("ban"));
    }
}