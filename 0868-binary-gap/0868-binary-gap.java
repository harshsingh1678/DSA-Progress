class Solution {
    public int binaryGap(int n) {
        String num = Integer.toBinaryString(n);
        int max = 0;
        int left = 0;
        for (int right = 1; right < num.length(); right++) {
            if (num.charAt(right) == '1') {
                max = Math.max(right - left, max);
                left = right;
            }
        }
        return max;
    }
}