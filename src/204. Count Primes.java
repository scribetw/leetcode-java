public class Solution {
    public int countPrimes(int n) {
        int primeCount = 0;
        boolean[] notPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                primeCount++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return primeCount;
    }
}