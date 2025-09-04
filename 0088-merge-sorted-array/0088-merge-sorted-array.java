class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m - 1;
        int nIndex = n - 1;
        int resIndex = (m + n) - 1;

        while (mIndex >= 0 && nIndex >= 0) {
            if(nums2[nIndex] > nums1[mIndex]){
                nums1[resIndex--] = nums2[nIndex--];
            }else{
                nums1[resIndex--] = nums1[mIndex--];
            }
        } 

        while(nIndex >= 0){
            nums1[resIndex--] = nums2[nIndex--];
        }  
    }
}