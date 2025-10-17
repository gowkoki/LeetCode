class Solution {
    public int dominantIndex(int[] nums) {
        int largestNum = nums[0];
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (largestNum < nums[i]) {
                largestNum = nums[i];
                maxIndex = i;
            }
        }

        for (int n : nums) {
            if (n != largestNum && (n * 2) > largestNum) {
                return -1;
            }
        }

        return maxIndex;
    }
}