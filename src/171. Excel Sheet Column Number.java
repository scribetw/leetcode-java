public class Solution {
    public int titleToNumber(String s) {
        int columnNumber = 0;
        
        int position = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            columnNumber += positionValue(position, c);
            position++;
        }
        
        return columnNumber;
    }
    
    private int positionValue(int position, char c) {
        int value = 1 + (c - 'A');
        while (position > 0) {
            value *= 26;
            position--;
        }
        return value;
    }
}