class Solution {
    public void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length && index < res.length; i++) {
            res[index++] = arr[i];
            if (arr[i] == 0 && index < res.length) {
                res[index++] = 0;
            }
        }

        for (int i = 0; i < res.length; i++) {
            arr[i] = res[i];
        }
    }
}