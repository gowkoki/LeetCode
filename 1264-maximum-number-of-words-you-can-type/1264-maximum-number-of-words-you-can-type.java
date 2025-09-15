class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int wordsCanType = words.length;

        for (String s : words) {
            for (char c : brokenLetters.toCharArray()) {
                if (s.contains(String.valueOf(c))) {
                    wordsCanType--;
                    break;
                }

            }
        }
        
        return wordsCanType;
    }
}