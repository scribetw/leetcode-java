public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        /*
        1, 1
        1, (1 ,1) // rsh1
        1, (2), 1 // a[i] = a[i] + a[i+1]
        */
        for (int i = 0; i <= rowIndex; i++) {
            result.add(0, 1); // rsh1
            for (int j = 1; j < i; j++) {
                result.set(j, result.get(j) + result.get(j + 1)); // a[i] = a[i] + a[i+1]
            }
        }
        return result;
    }
}