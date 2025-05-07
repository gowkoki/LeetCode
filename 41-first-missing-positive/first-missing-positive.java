class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] filterNeg = Arrays.stream(nums).filter(n -> n > 0).toArray();

        Arrays.sort(filterNeg);

        int val = 1;

        for (int i : filterNeg) {
            if (val == i) {
                val++;
            } else if (i > val) {
                return val;
            }
        }
        return val;
    }
}