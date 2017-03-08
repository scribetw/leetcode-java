public class Solution {
    public double myPow(double x, int n) {
        double powValue = myPow0(x, n, 1);
        return n >= 0 ? powValue : 1.0 / powValue;
    }
    
    private double myPow0(double x, int n, double value) {
        // Special case definition
        if (x == 0) return 0;
        
        while (true) {
            if (n == 0) {
                return value;
            }
            if ((n & 1) == 1) { // 3^7 = 3 * 3^6
                value *= x;
            }
            x *= x;             // 3^6 = (3^2)^3
            n /= 2;
        }
    }
}