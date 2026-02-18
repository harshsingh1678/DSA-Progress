class Solution {
    public boolean hasAlternatingBits(int n) {
        int remprev = n % 2;
        n /= 2;
        int rem;

        while (n != 0) {
            rem = n % 2;
            if (remprev == rem) return false;
            remprev = rem;
            n /= 2;
        }
        return true;
    }
}