class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int countOne = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countOne++;
            } else {
                maxOne = Math.max(maxOne, countOne);
                countOne = 0;
            }
        }

        return Math.max(maxOne, countOne);

    }
}