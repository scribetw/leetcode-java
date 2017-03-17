public class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        
        int root = 1;
        while (root <= x / root) { // root * root might overflow
            root++;
        }
        return root - 1;
    }
}