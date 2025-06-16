class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int total = 0;

        for (int n : nums) {
            total += n;
        }

        int right = total;

        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if (left == right) {
                return i;
            }
            left += nums[i];
        }

        return -1;
    }
}