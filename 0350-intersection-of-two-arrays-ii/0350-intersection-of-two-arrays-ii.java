class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        while (index1 < nums1.length && index2 < nums2.length) {

            if (nums1[index1] > nums2[index2]) {
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else {
                nums1[index3++] = nums1[index1];
                index1++;
                index2++;
            }

        }

        return Arrays.copyOfRange(nums1, 0, index3);
    }
}