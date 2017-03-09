public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int threshold = (int) Math.ceil(nums.length / 2.0);
        
        for (int num : nums) {
            Integer occurrence = count.get(num);
            if (occurrence == null) {
                occurrence = 0;
            }
            occurrence++;
            count.put(num, occurrence);
            
            if (occurrence >= threshold) {
                return num;
            }
        }
        return -1;
    }
}