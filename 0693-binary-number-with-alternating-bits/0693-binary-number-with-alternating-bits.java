class Solution {
    public boolean hasAlternatingBits(int n) {
        int rem;
        String res = "";
        while (n != 0) {
            rem = n % 2;
            res = rem + res;
            n /= 2;
        }
        for (int i = 1; i < res.length(); i++) {
            if (res.charAt(i - 1) == res.charAt(i))
                return false;
        }
        return true;
    }
}