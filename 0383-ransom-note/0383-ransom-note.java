class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            mMap.put(c, mMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (mMap.containsKey(c)) {
                if (mMap.get(c) == 1) {
                    mMap.remove(c);
                } else {
                    mMap.put(c, mMap.get(c) - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}