public class Solution {
    public int hammingDistance(int x, int y) {
        int xorValue = x ^ y;
        
        int hammingCount = 0;
        int bitValue = 1;
        while (xorValue > 0) {
            if ((xorValue & bitValue) > 0) {
                hammingCount++;
                xorValue -= bitValue;
            }
            bitValue <<= 1;
        }
        
        return hammingCount;
    }
}