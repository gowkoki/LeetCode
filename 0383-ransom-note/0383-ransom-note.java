class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ran = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            ran.put(c, ran.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            if (ran.containsKey(c)) {
                if (ran.get(c) > 1) {
                    ran.put(c, ran.get(c) - 1);
                } else {
                    ran.remove(c);
                }
            }

            if (ran.isEmpty()) {
                return true;
            }
        }

        return false;
    }
}