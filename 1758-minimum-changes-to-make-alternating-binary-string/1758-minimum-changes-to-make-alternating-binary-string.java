class Solution {
    public int minOperations(String s) {
        int even0 = 0, odd0 = 0;
        int even1 = 0, odd1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0')
                    even0++;
                else
                    even1++;
            } else {
                if (s.charAt(i) == '0')
                    odd0++;
                else
                    odd1++;
            }
        }

        int pattern1 = even1 + odd0; // "010101..."
        int pattern2 = even0 + odd1; // "101010..."
        return Math.min(pattern1, pattern2);
    }
}