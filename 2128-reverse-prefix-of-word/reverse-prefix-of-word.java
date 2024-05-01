class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word; // If ch is not found, return the original word
        }
        
        // Reverse the substring from index 0 to the index of ch
        StringBuilder reversedPrefix = new StringBuilder(word.substring(0, index + 1)).reverse();
        return reversedPrefix.toString() + word.substring(index + 1);
    }
}