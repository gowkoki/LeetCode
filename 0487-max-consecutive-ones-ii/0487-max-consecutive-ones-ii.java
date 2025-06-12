class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevOnesCount = 0;
        int curOnesCount = 0;
        int max = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n == 1) {
                curOnesCount++;
            } else {
                prevOnesCount = curOnesCount + 1;
                curOnesCount = 0;
            }

            max = Math.max(max, prevOnesCount + curOnesCount);
        }

        return max;
    }
}