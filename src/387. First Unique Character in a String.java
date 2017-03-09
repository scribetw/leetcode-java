public class Solution {
    public int firstUniqChar(String s) {
        int[] occurrence = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            occurrence[c - 'a']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (occurrence[c - 'a'] == 1) return i;
        }
        return -1;
    }
}