public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> buffer = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            buffer.add(getFizzBuzz(i));
        }
        return buffer;
    }
    
    private String getFizzBuzz(int position) {
        if (position % 15 == 0) {
            return "FizzBuzz";
        } else if (position % 3 == 0) {
            return "Fizz";
        } else if (position % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(position);
    }
}