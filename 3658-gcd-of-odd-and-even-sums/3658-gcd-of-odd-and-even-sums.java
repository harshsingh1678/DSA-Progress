class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = 0;
        int oddSum = 0;
        int i = 1;
        int even = 2;
        int odd = 1;

        while (i <= n) {

            evenSum += even;
            even += 2;

            oddSum += odd;
            odd += 2;
            i++;
        }
        return gcd(oddSum, evenSum);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}