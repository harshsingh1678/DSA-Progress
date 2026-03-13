class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if (sb.charAt(i) == ' ') {
                k--;
            }
            if(k == 0) return sb.substring(0,i).toString();
        }
        return sb.toString();
    }
}