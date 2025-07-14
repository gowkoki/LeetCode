class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int index1 = 0;
        int index2 = 0;

        while (index1 < nums1.length && index2 < nums2.length) {

            if (nums1[index1] == nums2[index2]) {
                result.add(nums1[index1]);
                index1++;
                index2++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            }

        }

        int[] ans = new int[result.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}