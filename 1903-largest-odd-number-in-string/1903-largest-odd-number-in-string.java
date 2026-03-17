class Solution {
    public String largestOddNumber(String num) {
        // StringBuilder sb = new StringBuilder(num);
        // for (int i = sb.length() - 1; i >= 0; i--) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0)
                return num.substring(0,i+1);
        }
        return "";
    }
}