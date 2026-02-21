class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        int bit = 0;

        for (int i = left; i <= right; i++) {
            String val = Integer.toBinaryString(i);
            bit = 0;
            for (int j = 0; j < val.length(); j++) {
                if (val.charAt(j) == '1')
                    bit++;
            }
            if(isprime(bit)) count++;
        }
        return count;
    }

    private boolean isprime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}