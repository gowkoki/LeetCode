class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);

            if (!anagram.containsKey(sorted)) {
                anagram.put(sorted, new ArrayList<>());
            }
            anagram.get(sorted).add(s);

        }

        return new ArrayList<>(anagram.values());
    }
}