class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            StringBuilder word = new StringBuilder(str[i]);
            result.append(word.reverse());
            if (i != str.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}