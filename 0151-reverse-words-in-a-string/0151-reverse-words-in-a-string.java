class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String result = "";

        for (int i = words.length - 1; i > 0; i--) {
            result += words[i] + " ";
        }
        return result + words[0];

    }
}