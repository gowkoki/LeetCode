class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        if (s.isEmpty())
            return 0;

        int sign = 1;
        int index = 0;
        long result = 0;

        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {

            int digit = s.charAt(index) - '0';
            result = result * 10 + digit;

            if (result > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            index++;
        }

        return (int) (sign * result);
    }
}