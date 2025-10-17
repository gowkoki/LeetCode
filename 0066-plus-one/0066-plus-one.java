class Solution {
    public int[] plusOne(int[] digits) {
        int rem = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                rem=0;
                break;
            } else {
                digits[i] = 0;
                rem =1;
            }
        }

        if (rem == 0) {
            return digits;
        }

        int[] result = new int[digits.length + 1];
        result[0] = rem;

        for (int i = 1; i < result.length; i++) {
            result[i] = digits[i - 1];
        }

        return result;

    }
}