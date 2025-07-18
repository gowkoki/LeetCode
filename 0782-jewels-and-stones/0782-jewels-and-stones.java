
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> frequency = new HashMap<>();
        int count = 0;

        for (char c : stones.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (char c : jewels.toCharArray()) {
            if (frequency.containsKey(c)) {
                count += frequency.get(c);
            }
        }

        return count;
    }
}