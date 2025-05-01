class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length && diff != 0; i++) {
            int p2 = i + 1;
            int p3 = nums.length - 1;
            while (p2 < p3) {
                int sum = nums[i] + nums[p2] + nums[p3];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (sum < target) {
                    p2++;
                } else {
                    p3--;
                }
            }

        }
        return target - diff;
    }
}