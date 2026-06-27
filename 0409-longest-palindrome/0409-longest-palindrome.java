class Solution {
    public int longestPalindrome(String s) {

        int res = 0;
        boolean odd = false;
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i : map.values()) {
            if (i % 2 == 0)
                res += i;
            else {
                odd = true;
                res += i - 1;
            }
        }
        return res + (odd ? 1 : 0);
    }
}