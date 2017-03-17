public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        rotate(nums, 0, nums.length - 1 - k); // [(1,2,3,4),5,6,7] => [4,3,2,1,5,6,7]
        rotate(nums, nums.length - k, nums.length - 1); // [4,3,2,1,(5,6,7)] => [4,3,2,1,7,6,5]
        rotate(nums, 0, nums.length - 1); // [(4,3,2,1,7,6,5)] => [5,6,7,1,2,3,4]
    }
    
    private void rotate(int[] array, int from, int to) {
        while (from < to) {
            int temp = array[from];
            array[from] = array[to];
            array[to] = temp;
            from++;
            to--;
        }
    }
}