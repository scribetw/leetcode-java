public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prevPascal = null;
        for (int i = 1; i <= numRows; i++) {
            List<Integer> thisPascal = generatePascal(i, prevPascal);
            result.add(thisPascal);
            prevPascal = thisPascal;
        }
        return result;
    }
    
    private List<Integer> generatePascal(int n, List<Integer> prevPascal) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) { // Edge
                result.add(1);
            } else {
                result.add(prevPascal.get(i - 2) + prevPascal.get(i - 1)); // Value = prev1 + prev2
            }
        }
        return result;
    }
}