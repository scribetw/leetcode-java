public class Solution {
    public int getSum(int a, int b) {
        return getSum0(a, b);
    }
    
    private int getSum0(int a, int b) {
	    return (b == 0) ? a : getSum0(a ^ b, (a & b) << 1);
    }
}