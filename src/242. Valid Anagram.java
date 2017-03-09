public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] occurrence = new int[26];
        
        for (char c : s.toCharArray()) {
            occurrence[c - 'a']++;
        }
        
        for (char c : t.toCharArray()) {
            occurrence[c - 'a']--;
        }
        
        for (int times : occurrence) {
            if (times != 0) return false;
        }
        return true;
    }
}