public class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            int resultNew = result * 10 + digit;
            if (resultNew / 10 != result) { // overflow
                return 0;
            }
            result = resultNew;
            x /= 10;
        }
        return result;
    }
}