
//import com.sun.tools.javac.code.Attribute.Array;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        if (n < 4) {
            return result;
        }

        for (int i = 0; i <= n - 4; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j <= n - 3; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int p1 = j + 1;
                int p2 = n - 1;
                while (p1 < p2) {
                    long sum = (long) nums[i] + nums[j] + nums[p1] + nums[p2];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[p1], nums[p2]));
                        while (p1 < p2 && nums[p1] == nums[p1 + 1])
                            p1++;
                        while (p1 < p2 && nums[p2] == nums[p2 - 1])
                            p2--;

                        p1++;
                        p2--;
                    } else if (sum < target) {
                        p1++;
                    } else {
                        p2--;
                    }

                }

            }
        }

        return result;

    }
}