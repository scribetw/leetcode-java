public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int current = nums[0];
        int distinctCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != current) {
                current = nums[i];
                nums[distinctCount++] = nums[i];
            }
        }
        return distinctCount;
    }
}