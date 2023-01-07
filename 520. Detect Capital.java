class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1)
            return true;
        int i = 0;
        boolean isSmall = word.charAt(i) >= 97 && word.charAt(i) <= 122;
        i++;
        if (isSmall)
            while (i < word.length()) {
                if (word.charAt(i) >= 65 && word.charAt(i) <= 90)
                    return false;
                i++;
            }
        else {
            boolean isBig = word.charAt(i) >= 65 && word.charAt(i) <= 90;
            i++;
            if (isBig)
                while (i < word.length()) {
                    if (word.charAt(i) >= 97 && word.charAt(i) <= 122)
                        return false;
                    i++;
                }
            else
                while (i < word.length()) {
                    if (word.charAt(i) >= 65 && word.charAt(i) <= 90)
                        return false;
                    i++;
                }
        }
        return true;
    }
}