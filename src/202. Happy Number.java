public class Solution {
    public boolean isHappy(int n) {
        int t = n;
        int h = n;
        while (true) {
            // Cycle Detection (Tortoise vs Hare)
            t = newHappy(t);
            if (t == 1) return true;
            h = newHappy(newHappy(h));
            if (t == h) return false;
        }
    }
    
    private int newHappy(int n) {
        int newValue = 0;
        while (n != 0) {
            int digit = n % 10;
            newValue += digit * digit;
            n /= 10;
        }
        return newValue;
    }
}