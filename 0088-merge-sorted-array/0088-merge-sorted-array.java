class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m - 1;
        int nIndex = nums2.length - 1;
        int kIndex = nums1.length - 1;

        while (nIndex >= 0 && mIndex >= 0) {
            if (nums2[nIndex] > nums1[mIndex]) {
                nums1[kIndex--] = nums2[nIndex--];
            } else {
                nums1[kIndex--] = nums1[mIndex--];
            }
        }

        while (nIndex >= 0) {
            nums1[kIndex--] = nums2[nIndex--];
        }

    }
}