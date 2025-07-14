class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] sChar = s.toCharArray();

        for (int i = 0; i < sChar.length; i++) {
            if (map.containsKey(sChar[i])) {
                map.put(sChar[i], -1);
            } else {
                map.put(sChar[i], i);
            }
        }

        int min = Integer.MAX_VALUE;

        for (int index : map.values()) {
            if (index != -1) {
                min = Math.min(min, index);
            }
        }

        return min != Integer.MAX_VALUE ? min : -1;

    }
}