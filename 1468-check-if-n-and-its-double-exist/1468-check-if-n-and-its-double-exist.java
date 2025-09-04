class Solution {
    public boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i] * 2;

            if (find(val, arr, i)) {
                return true;
            }
        }

        return false;
    }

    boolean find(int val, int[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val && index != i) {
                return true;
            }
        }
        return false;
    }
}