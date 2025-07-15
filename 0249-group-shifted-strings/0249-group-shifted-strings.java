class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> group = new HashMap<>();

        for (String s : strings) {
            String key = rotation(s);
            List<String> list = group.getOrDefault(key, new ArrayList<>());
            list.add(s);
            group.put(key, list);
        }

        return new ArrayList<>(group.values());
    }

    private String rotation(String s) {
        StringBuilder str = new StringBuilder();
        int diff = s.charAt(0) - 'a';

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            char diffAdjust = (char) (((current - 'a' - diff) % 26 + 26) % 26 + 'a');
            str.append(diffAdjust);
        }

        return str.toString();
    }
}