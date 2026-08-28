package practice.leetcode.common;

public class GuessGame {
    private int pick;

    public void setPick(int pick) {
        this.pick = pick;
    }

    /**
     * Метод, который будет вызываться в решении.
     * @param num предполагаемое число
     * @return  0 если num == pick,
     *         -1 если num > pick,
     *          1 если num < pick
     */
    public int guess(int num) {
        return Integer.compare(pick, num);  // эквивалентно условиям выше
    }
}
