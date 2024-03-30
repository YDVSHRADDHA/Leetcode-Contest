class Solution {
    public boolean isAnagram(String s, String t) {
        // Check if the lengths of the strings are equal
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Check if the sorted arrays are equal
        return Arrays.equals(sChars, tChars);
    }
}