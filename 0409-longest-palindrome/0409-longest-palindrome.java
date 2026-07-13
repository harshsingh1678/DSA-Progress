class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        boolean odd = false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int val : map.values()) {
            if (val % 2 == 0) {
                res += val;
            } else {
                odd = true;
                res += val - 1;
            }
        }
        return res + (odd ? 1 : 0);
    }
}