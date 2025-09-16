class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int zeros = 0;
        int ones = 0;
        int indexZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ones++;
            } else if (nums[i] == 0 && zeros < 1) {
                ones++;
                zeros++;
                indexZero = i;
            } else {
                maxOnes = Math.max(maxOnes, ones);
                ones = i-indexZero;
                indexZero = i;
            }
        }

        return Math.max(maxOnes, ones);
    }
}