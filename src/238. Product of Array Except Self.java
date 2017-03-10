public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        
        int total = 1;
        for (int i = 0; i < nums.length; i++) {
            products[i] = total; // product before this number
            total *= nums[i];
        }
        
        total = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            products[i] *= total; // product after this number
            total *= nums[i];
        }
        return products;
    }
}