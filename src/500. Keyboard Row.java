import java.util.*;

public class Solution {
    private static final String[] KEYBOARD_ROWS = new String[] {
        "qwertyuiop", "asdfghjkl", "zxcvbnm"
    };
    
    public String[] findWords(String[] words) {
        List<String> matchWords = new ArrayList<String>();
        for (String word : words) {
            if (allInTheSameRow(word.toLowerCase())) {
                matchWords.add(word);
            }
        }
        
        return matchWords.toArray(new String[matchWords.size()]);
    }
    
    private boolean allInTheSameRow(String word) {
        String firstRow = findFirstRow(word.charAt(0));
        if (firstRow == null) {
            return false;
        }

        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i); 
            if (firstRow.indexOf(c) == -1) {
                return false;
            }
        }
        
        return true;
    }
    
    private String findFirstRow(char firstLetter) {
        for (String row : KEYBOARD_ROWS) {
            if (row.indexOf(firstLetter) != -1) {
                return row;
            }
        }
        return null;
    }
}