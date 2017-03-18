public class Solution {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len2 == 0) {
            return 0;
        }
        
        for (int pos1 = 0; pos1 < len1; pos1++) {
            for (int pos2 = 0; pos2 < len2; pos2++) {
                if (pos1 + pos2 == len1) {
                    return -1;
                }
                if (haystack.charAt(pos1 + pos2) != needle.charAt(pos2)) {
                    break;
                }
                if (pos2 == len2 - 1) {
                    return pos1;
                }
            }
        }
        return -1;
    }
}