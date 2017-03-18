public class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        
        // Need carry (more space)
        int[] newDigits = new int[length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}