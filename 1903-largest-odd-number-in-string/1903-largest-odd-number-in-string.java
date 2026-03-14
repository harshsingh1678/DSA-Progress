class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) % 2 != 0)
                return sb.toString();
            else
                sb.deleteCharAt(i);
        }
        return sb.toString();
    }
}