class Solution {
    public void duplicateZeros(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length && index < result.length; i++) {
            if (arr[i] == 0) {
                result[index++] = arr[i];
                if (index < result.length) {
                    result[index++] = 0;
                }
            } else {
                result[index++] = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }
}