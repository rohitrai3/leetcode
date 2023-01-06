import java.util.Collection;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> letterToWord = new HashMap<>();
        Map<String,Character> wordToLetter = new HashMap<>();
        char[] letters = pattern.toCharArray();
        String[] words = s.split(" ");
        if (letters.length != words.length)
            return false;
        for (int i = 0; i < letters.length; i++) {
            letterToWord.putIfAbsent(letters[i], words[i]);
            if (letterToWord.get(letters[i]).compareTo(words[i]) != 0)
                return false;
            wordToLetter.putIfAbsent(words[i], letters[i]);
            if (wordToLetter.get(words[i]).compareTo(letters[i]) != 0)
                return false;
        }
        return true;
    }
}