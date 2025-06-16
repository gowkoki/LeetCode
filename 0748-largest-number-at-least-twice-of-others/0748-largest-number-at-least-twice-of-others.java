class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                maxIndex = i;
                max = nums[i];
            }
        }

        Arrays.sort(nums);
        if (nums[nums.length - 2] * 2 <= max) {
            return maxIndex;
        }
        return -1;

    }
}