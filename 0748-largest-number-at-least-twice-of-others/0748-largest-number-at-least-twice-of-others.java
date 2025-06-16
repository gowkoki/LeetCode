class Solution {
    public int dominantIndex(int[] nums) {
        int firstMax = 0;
        int secondMax = 0;
        int maxIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (firstMax < nums[i]) {
                secondMax = firstMax;
                maxIndex = i;
                firstMax = nums[i];
            } else if (secondMax < nums[i]) {
                secondMax = nums[i];
            }
        }

        return secondMax * 2 <= firstMax ? maxIndex : -1;

    }
}