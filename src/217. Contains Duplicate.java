public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for (int num : nums) {
            if (!sets.add(num)) return true;
        }
        return false;
    }
}