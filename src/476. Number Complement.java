public class Solution {
    public int findComplement(int num) {
        int log2n = (int) Math.floor(Math.log(num) / Math.log(2));
        int full = (1 << log2n + 1) - 1;
        return full - num;
    }
}