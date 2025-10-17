class Solution {
    public int pivotIndex(int[] nums) {
        int index = 0;
        int total = 0;

        for (int n : nums) {
            total += n;
        }

        int rightSum = total;
        int leftSum = 0;

        while (index < nums.length) {
            rightSum -= nums[index];

            if (leftSum == rightSum) {
                return index;
            }

            leftSum += nums[index];
            index++;
        }

        return -1;
    }
}