package practice.leetcode.problems.p1318minimumflipstomakeaorbequaltoc;

public class MinimumFlipsToMakeAOrBEqualToC {
    public int minFlips(int a, int b, int c) {
        int operations = 0;
        for (int i = 0; i < 32; i++) {
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int bitC = (c >> i) & 1;
            if (bitC == 1) {
                if(bitB == 0 && bitA == 0) operations++;
            } else {
                operations += bitA + bitB;
            }
        }
        return operations;
    }
}
