public class Solution {
    private Map<Character, Integer> roman = new HashMap<>();
    
    public Solution() {
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
    }
    
    public int romanToInt(String s) {
        int len = s.length();
        int[] values = new int[len];
        
        int i = 0;
        for (char c : s.toCharArray()) {
            values[i++] = roman.get(c);
        }
        
        int total = 0;
        for (int j = 0; j < len - 1; j++) {
            if (values[j] < values[j + 1]) {
                values[j] = -values[j]; // XL = -10+50
            }
            total += values[j];
        }
        total += values[len - 1];
        return total;
    }
}