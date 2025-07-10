class Solution {
    public int singleNumber(int[] nums) {
        int output = 0;

        for (int n : nums) {
            output ^= n;
        }

        return output;
    }
}