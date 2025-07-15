class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagram = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);

            if (!anagram.containsKey(sorted)) {
                List<String> list = new ArrayList<>();
                list.add(s);
                anagram.put(sorted, list);
            } else {
                anagram.get(sorted).add(s);
            }
        }

        result.addAll(anagram.values());

        return result;
    }
}