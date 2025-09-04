class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int index = 0;

        while (index + 1 < arr.length && arr[index] < arr[index + 1]) {
            index++;
        }

        if (index == 0 || index == arr.length - 1) {
            return false;
        }

        while (index + 1 < arr.length && arr[index] > arr[index + 1]) {
            index++;
        }

        return index == arr.length - 1;
    }
}