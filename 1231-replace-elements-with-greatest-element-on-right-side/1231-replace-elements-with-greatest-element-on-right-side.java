class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (max < arr[i]) {
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            } else {
                arr[i] = max;
            }
        }

        return arr;
    }
}