class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();
        int maxlength = 0;

        for (char c : s.toCharArray()) {
            while (queue.contains(c)) {
                queue.remove();
            }

            queue.add(c);
            maxlength = Math.max(maxlength, queue.size());
        }

        return maxlength;
    }
}