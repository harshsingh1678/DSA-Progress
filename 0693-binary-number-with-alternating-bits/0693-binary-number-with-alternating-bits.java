class Solution {
    public boolean hasAlternatingBits(int n) {
        int rem;
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            rem = n % 2;
            sb.append(rem);
            n /= 2;
        }
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i - 1) == sb.charAt(i))
                return false;
        }
        return true;
    }
}