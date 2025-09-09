class Solution {
    public int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = find(arr, i + 1);
        }
        arr[arr.length - 1] = -1;
        return arr;

    }

    int find(int[] arr, int start) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}