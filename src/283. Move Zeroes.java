public class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[p] = nums[i];
                if (i != p) nums[i] = 0; // Prevent zeroing self
                p++;
            }
        }
    }
}