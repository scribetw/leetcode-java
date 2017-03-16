public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums1) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> intersect = new ArrayList<Integer>();
        for (int n : nums2) {
            Integer count = numMap.get(n);
            if (count != null && count > 0) {
                intersect.add(n);
                numMap.put(n, count - 1);
            }
        }
        
        int[] result = new int[intersect.size()];
        for (int i = 0; i < intersect.size(); i++) {
            result[i] = intersect.get(i);
        }
        return result;
    }
}