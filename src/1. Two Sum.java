public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int remaining = target - number;
            Integer possibleNumberIndex = cache.get(remaining);
            if (possibleNumberIndex != null) {
                return new int[] {possibleNumberIndex, i};
            }
            cache.put(number, i);
        }
        return new int[] {0, 0};
    }
}