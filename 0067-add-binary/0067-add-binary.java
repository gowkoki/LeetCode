class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int aVal = a.length() - 1;
        int bVal = b.length() - 1;
        int carry = 0;

        while (aVal >= 0 || bVal >= 0 || carry == 1) {
            int total = carry;
            if (aVal >= 0) {
                total += a.charAt(aVal--) - '0';
            }

            if (bVal >= 0) {
                total += b.charAt(bVal--) - '0';
            }

            result.append(total % 2);
            carry = total / 2;

        }

        return result.reverse().toString();

    }

}