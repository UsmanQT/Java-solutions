public class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] newString = new char[word1.length() + word2.length()];
        int j = 0;

        for(int i = 0 ; i <= newString.length - 1 ; i++) {
            if(newString[i] != 0) {
                continue;
            }
            if(word1.length() == word2.length()) {
                newString[i] = word1.charAt(j);
                newString[i+1] = word2.charAt(j);
            }
            if(word1.length() < word2.length()) {
                if(j < word1.length() && j < word2.length()) {
                    newString[i] = word1.charAt(j);
                    newString[i+1] = word2.charAt(j);
                }
                else {
                    newString[i] = word2.charAt(j);
                }
            }
            if(word1.length() > word2.length()) {
                if(j < word1.length() && j < word2.length()) {
                    newString[i] = word1.charAt(j);
                    newString[i+1] = word2.charAt(j);
                }
                else {
                    newString[i] = word1.charAt(j);
                }
            }

            j++;
        }

        String a = new String(newString);
        return a;
    }

}