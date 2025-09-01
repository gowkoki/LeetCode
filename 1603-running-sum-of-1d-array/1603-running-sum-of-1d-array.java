class Solution {
    public int[] runningSum(int[] nums) {
        int tot = 0;
        for (int i = 0; i < nums.length; i++) {
            tot += nums[i];
            nums[i] = tot;
        }
        return nums;
    }
}