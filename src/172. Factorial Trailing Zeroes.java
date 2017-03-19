public class Solution {
    public int trailingZeroes(int n) {
        int zeroes = 0;
        while (n / 5 > 0) {
            zeroes += (n / 5); // How many 5s exists (5, 10, 15...)
            n /= 5; // ex: 100 = 5*5*4, 20 = 5*4
        }
        return zeroes;
    }
}